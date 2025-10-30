

function updateDisplay(){
    const now = new Date();

    let hours = now.getHours();
      let minutes = now.getMinutes();
        let second = now.getSeconds();
        
        const ampm = hours >= 12 ? "pm" : "am";
        hours = hours % 12 || 12;

        hours = String(hours).padStart(2, '0');
        minutes =String(minutes).padStart(2 , '0');
        second = String(second).padStart(2, '0');

        document.getElementById("time").textContent = `${hours}:${minutes}:${second} ${ampm}`;

        const options = { weekly :'long', year:'numeric' , month:'long', day:'numeric'};
        document.getElementById("date").textContent = now.toLocaleDateString('en-Us' , options);

        setInterval(updateDisplay , 1000);

}
updateDisplay();