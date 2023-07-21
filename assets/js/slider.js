var img = document.getElementById('img');

var slides=['./assets/img/d.jpg','./assets/img/B.jpg'];

var Start=0;

function slider(){
    if(Start<slides.length){
        Start=Start+1;
    }
    else{
        Start=1;
    }
    console.log(img);
    img.innerHTML = "<img  class='a'       src="+slides[Start-1]+">";

}
setInterval(slider,2000);