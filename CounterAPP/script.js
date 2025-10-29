const COUNT = document.getElementById("count");
const IncreaseCount = document.getElementById("increment");
const RESET = document.getElementById("reset");
const DecrementCount = document.getElementById("decrement");

let count = 0;

function updateDisplay(){
   COUNT.textContent = count;
}

IncreaseCount.addEventListener("click",function(){
    count++;
    updateDisplay();
});

RESET.addEventListener("click",function(){
    count = 0;
    updateDisplay();
})

DecrementCount.addEventListener("click",function(){
    
   if(count >0){
    count--;
   } else{
    count = 0;
   }
   updateDisplay();
})


updateDisplay();