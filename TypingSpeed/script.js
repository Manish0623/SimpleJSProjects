const quotes = [
  "The quick brown fox jumps over the lazy dog.",
  "Practice makes perfect when you never give up.",
  "Code is like humor. When you have to explain it, its bad.",
  "Dream big, work hard, stay humble.",
  "Every great developer you know started as a beginner.",
  "JavaScript makes the web alive and interactive.",
  "Do not watch the clock. Do what it does. Keep going.",
  "Simplicity is the soul of efficiency.",
  "Typing fast is not enough, accuracy is the key.",
  "Believe you can and you are halfway there."
];

const quoteEl = document.getElementById("quote");
const typedValue = document.getElementById("typed-value");
const startBtn = document.getElementById("start");
const resultEl = document.getElementById("result");

let currentQuoteIndex = 0;
let startTime = 0;
let totalWords = 0;
let totalTime = 0;

function showQuote(index) {
  quoteEl.textContent = quotes[index];
  typedValue.value = "";
  typedValue.disabled = false;
  typedValue.focus();
  typedValue.style.borderColor = "#ccc";
  startTime = new Date().getTime();
}

startBtn.addEventListener("click", () => {
  currentQuoteIndex = 0;
  totalWords = 0;
  totalTime = 0;
  resultEl.textContent = "";
  showQuote(currentQuoteIndex);
});

typedValue.addEventListener("input", () => {
  const typedText = typedValue.value;
  const currentQuote = quotes[currentQuoteIndex];

  if (typedText === currentQuote) {
   
    const elapsed = (new Date().getTime() - startTime) / 1000;
    const words = currentQuote.split(" ").length;
    totalWords += words;
    totalTime += elapsed;

  
    currentQuoteIndex++;

    if (currentQuoteIndex < quotes.length) {
   
      resultEl.textContent = `✅ Sentence ${currentQuoteIndex} done! Keep going...`;
      setTimeout(() => showQuote(currentQuoteIndex), 800);
    } else {
     
      const wpm = Math.round((totalWords / totalTime) * 60);
      resultEl.textContent = `🎯 All ${quotes.length} sentences done! Your average speed: ${wpm} WPM`;
      typedValue.disabled = true;
      quoteEl.textContent = "Test Complete!";
    }
  } else {

    if (currentQuote.startsWith(typedText)) {
      typedValue.style.borderColor = "green";
    } else {
      typedValue.style.borderColor = "red";
    }
  }
});

