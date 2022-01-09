window.onscroll = function (){
    if(document.documentElement.scrollTop>1000){
        document.getElementById("myNavbar").style.padding="0px 0px"
    }
    else {
        document.getElementById("myNavbar").style.padding ="25px 10px";
    }

}


window.onload = function load() {
    if (window.innerWidth < 757) {
        document.getElementById("panel").style.display = "none";
        document.getElementById("panel2").style.display = "block";

    } else {
        document.getElementById("panel").style.display = "block";
        document.getElementById("panel2").style.display = "none";
    }
}
window.onresize = resize;
function resize()
{
    if(window.innerWidth < 757){
        document.getElementById("panel").style.display = "none";
        document.getElementById("panel2").style.display = "block";
    }

    else{
        document.getElementById("panel").style.display = "block";
        document.getElementById("panel2").style.display = "none";
    }



}
