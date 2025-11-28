

function reverseInteger(number){
    let rev = 0;
    let num = Math.abs(number);

    while(num > 0){
        let digit = num % 10 ; 
        rev = rev * 10 + digit ; 
        num = Math.floor(num / 10);

    }
    return number  < 0 ? -rev : rev ;

}

let num = 12345;
console.log(reverseInteger(num));