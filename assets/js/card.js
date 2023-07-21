const shipping_types = [
    {
        title: "الجوي",
        description: `نوفر خدمة النقل والشحن الجوي مع أكبر خطوط الشحن الجوية عالميا وأكثرها سرعة وأمان`,
        url: "./assets/car.png",
    },
    {
        title: "البري",
        description: ` نوفر خدمة النقل والشحن البري مع كافة أنواع الشاحنات الحديثة والمطورة`,
        url: "./assets/car.png",
    },
    {
        title: "البحري",
        description: `نوفر خدمة النقل والشحن البحري في أضخم السفن والناقلات البحرية المخصصة للنقل والمعروفة عالميا`,
        url: "./assets/car.png",
    },
];
const shipping = document.getElementById("type");

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
    <p class="ship_card_title" id="title">${type.title}</p>
    <p class="shipping_txt">${type.description}</p>
  </div>`;
    })
    .join("");

shipping.innerHTML = showShippingTypes;
