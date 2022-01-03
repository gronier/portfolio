window.onscroll = function (){
    if(document.documentElement.scrollTop>1000){
        document.getElementById("myNavbar").style.padding="0px 0px"
    }
    else {
        document.getElementById("myNavbar").style.padding ="25px 10px";
    }

}