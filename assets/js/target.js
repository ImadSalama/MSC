const target = [
  {
    title: "رسالتنا",
    text: "نحن نحرص على تقديم أعلى معايير المهنية، خدمات استيراد وتصدير وخدمات لوجستية موثوقة وآمنة وموفرة للتكلفة في جميع أنحاء العالم",
  },
  {
    title: "رؤيتنا",
    text: "نتطلع إلى تسهيلات شاملة لكافة خدماتنا، وذلك لأن رضى عملائنا هو أولويتنا",
  },
  {
    title: "هدفنا",
    text: "تحقيق الثقة والمصداقية في التعامل مع العملاء",
  },
];
const content = document.getElementById("footer");

const showTargetContent = target
  .map((targetItem, index) => {
    return `<div class="target_card" style="position: absolute;top:100px;">
        <p class="target_title">${targetItem.title}</p>
        <p class="target_txt">${targetItem.text}</p>
        </div>`;
  })
  .join("");

