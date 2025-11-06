document.addEventListener('DOMContentLoaded', () => {
  const firstNumber = document.getElementById('first');
  const secondNumber = document.getElementById('second');
  const Button = document.getElementById('btn');
  const span = document.getElementById('result');
  const operate = document.getElementById('operator');

  Button.addEventListener('click', () => {
    const Number1 = parseFloat(firstNumber.value);
    const Number2 = parseFloat(secondNumber.value);
    const OP = operate.value;

    let output;

    if (isNaN(Number1) || isNaN(Number2)) {
      output = "Invalid number";
    } else {
      switch (OP) {
        case 'Addition':
          output = Number1 + Number2;
          break;
        case 'Subtract':
          output = Number1 - Number2;
          break;
        case 'Multiplication':
          output = Number1 * Number2;
          break;
        case 'Division':
       //   output = Number2 !== 0 ? (Number1 / Number2).toFixed(2) : "Cannot divide by zero";
       output = Number2 !== 0 ? (Number1 / Number2).toFixed(2) : "cannot divide by zero";
          break;
        default:
          output = "Invalid operator";
      }
    }

    setTimeout(() => {
      span.textContent = output;
    }, 500);
  });
});
