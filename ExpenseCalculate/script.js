const form = document.getElementById('expense-form');
const descriptionInput = document.getElementById('description');
const amountInput = document.getElementById('amount');
const expenseList = document.getElementById('expense-list');
const totalEl = document.getElementById('total');

let expenses = JSON.parse(localStorage.getItem('expenses')) || [];

// Update total
function updateTotal() {
  const total = expenses.reduce((sum, expense) => sum + expense.amount, 0);
  totalEl.textContent = total.toFixed(2);
}


function renderExpenses() {
  expenseList.innerHTML = '';

  expenses.forEach((expense, index) => {
    const li = document.createElement('li');
    li.textContent = `${expense.description}: ₹${expense.amount.toFixed(2)} `;

    const deleteBtn = document.createElement('button');
    deleteBtn.textContent = 'Delete';
    deleteBtn.addEventListener('click', () => {
      expenses.splice(index, 1);
      saveAndRender();
    });

    li.appendChild(deleteBtn);
    expenseList.appendChild(li);
  });

  updateTotal();
}


function saveAndRender() {
  localStorage.setItem('expenses', JSON.stringify(expenses));
  renderExpenses();
}


form.addEventListener('submit', (e) => {
  e.preventDefault();

  const description = descriptionInput.value.trim();
  const amount = parseFloat(amountInput.value);

  if (description && amount > 0) {
    expenses.push({ description, amount });
    saveAndRender();

   
    descriptionInput.value = '';
    amountInput.value = '';
  } else {
    alert('Please enter a valid description and amount!');
  }
});


renderExpenses();
