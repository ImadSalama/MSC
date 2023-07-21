const shipping_types = [
    {
        title:``,
        description: `آلية العمل مع الوكيل الجمركي`,
        url: "./assets/img/work.png",
        function:`toggle3()`,

    },
    {
        title: ``,
        description: ` الاجراءات العامة`,
        url: "./assets/img/procedures.png",
        function:`toggle2()`,
    },
    
];
const shipping = document.getElementById("typee");

/*const showShippingTypes = shipping_types
  .map((type, index) => {
    return `<div class="ship_card" style="background-image: url(${type.url});background-position:"center";background-opacity:0.5;background-size:"contain"
    ">

    <p class="ship_card_title" id="title">${type.title}</p>
    <p class="shipping_txt">${type.description}</p>
  </div>`;
  })
  .join("");*/
const showShippingTypes = shipping_types
    .map((type, index) => {
        return `<div class="ship_card">
    <img src=${type.url} class="type_img"/>
    <p dir="rtl" class="ship_card_title" id="title">${type.title}</p>
    <p class="shipping_txt">${type.description}</p>
    <a href="#" onclick="${type.function}">قراءة المزيد</a>

    </div>`;
    })
    .join("");

function toggle1() {
    var blur=document.getElementById('target');
    blur.classList.toggle('active');
    var popup = document.getElementById('popup1');
    popup.classList.toggle('active');


}
function toggle3() {
    var blur=document.getElementById('target');
    blur.classList.toggle('active');
    var popup = document.getElementById('popup3');
    popup.classList.toggle('active');


}

function toggle2() {
    var blur=document.getElementById('target');
    blur.classList.toggle('active');
    var popup = document.getElementById('popup2');
    popup.classList.toggle('active');


}
function button() {

    var blur=document.getElementById('target');
    blur.classList.toggle('active');
    var popup = document.getElementById('popup_button');
    popup.classList.toggle('active');
}

shipping.innerHTML = showShippingTypes;
