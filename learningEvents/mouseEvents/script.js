const button = document.getElementById('btn');
const BOX = document.getElementById('box')
button.addEventListener('mouseover',()=>{
    BOX.style.backgroundColor ='green';
})

button.addEventListener('mouseleave',()=>{
    BOX.style.backgroundColor = 'violet';
})