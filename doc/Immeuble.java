import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
import java.util.Scanner;

import static java.lang.Float.parseFloat;

class Immeuble {
    static final int nbAppartements = 12;

    int id; // identifiant de l'immeuble
    float[] surface = new float[nbAppartements]; // surface de chaque appartement
    float res;

    public void moyenne() throws FileNotFoundException {
        Scanner in = new Scanner(new File("Immeuble.txt"));
        int somme = 0;
        int nb = 0;
        while (in.hasNextLine()) {
            String element = in.next();
            in.useDelimiter(":");
            if (element != "0.0") {
                int elements  = Integer.parseInt(element);
                System.out.println(element);
                nb++;
                //somme += element;
            } else {
                res=somme/nb;
                System.out.println(res);
                somme=0;
                nb=0;
            }
            //je voulais faire que quand je trouve "0.0" donc le dernier element de l'objet , faire la moyenne des element d'avant .


            System.out.println(element);
            System.out.println("-----------");

        }
    }

    public void transform() throws FileNotFoundException {
        Scanner in2 = new Scanner(new File("Immeuble.txt"));
        PrintWriter out = new PrintWriter("result.txt");
        StringBuilder s = new StringBuilder();
        while (in2.hasNextLine()) {
            String element = in2.next();
            in2.useDelimiter(":");
            Float elements;
            elements = parseFloat(element);
            System.out.println(elements);


        }


    }


    public static void main(String[] args) throws FileNotFoundException {
        Immeuble i = new Immeuble();
        i.moyenne();
        //i.transform();
    }
}