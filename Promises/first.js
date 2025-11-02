var n=2;
function square (num){
    var ans = num * num;
    return ans;
}
var square2 = square(n);
var square4 = square(4);

const { log } = require("console")

//const { validate } = require("../../models/userModel");


getName();
console.log(x);


var x =7;
function getName(){
    console.log('hi learn javascript as soon as possible');
}


var x = 1;
a();
b();
console.log(x);

function a(){
    var x= 10;
    console.log(x)
}

function b(){
    var x=100;
    console.log(x)
}



var a= 10;
function b(){
    var x= 10;
}
console.log(b);


var a ;
console.log(a);

if(a == undefined){
    console.log("a is defined")
}
else{
    console.log("a is not undefined...")
}


var a;
console.log(a);
a=10;
console.log(a);
a="how are you child..."




let a =10;
let b=100;
console.log(a,b);



function x(){
    var a = 7;
    function y(){
        console.log(a)
    }
    return y;
}
x();


var z = x();
console.log(z);

z();



function x()  {
    var i = 1;
    setTimeout(function (){
        console.log(i)
    },3000);
    console.log("how dare you ")
}
x();




// Function Statement...
function a(){
    console.log("the function is called..")
}
a();


// Function Expression
// 
var b=function(){
    console.log("second function is called..")
}
b();

// function declaration....
{/**
    function () {

}
    */}



// first class function - ability to use different function as values...


// what is a callback function in javascript...

setTimeout(function (){
console.log("function is called")
},3000);

function x(y){
    console.log("x");
    y();
}
+-
x(function y(){
    console.log('y')
})


function attach(){
    let count =0
document.getElementById("clickme").addEventListener("click", function xyz() {
    console.log("something is being pressed", count++);
});

}
attach();





// Promises.....

const cart = ["shoes","pants","T-shirts"];

createOrder(cart,function(orderId){
    proceedToPayment(orderId);
});

const promise = createOrder(cart);
promise.then(function(orderId){
    proceedToPayment(orderId);
});

const GITHUB_API= "https://api.github.com/users/akshaymarch7";
const user=fetch(GITHUB_API);
console.log(user);



// A promise is an object representing the eventual completion or failure of an asynchronous operation...

// creating a promise....




//const cart = ["foodItems", "groccery", "wardware", "kitchen Utensils"];

//const promise = createOrder(cart);

promise
    .then(function(orderId) {
        proceedToPayment(orderId);
    })
    .catch(function(err) {
        console.error(err.message);
    });

function createOrder(cart) {
    const pr = new Promise(function(resolve, reject) {
        if (!validateCart(cart)) {
            const err = new Error("cart is not working....");
            reject(err);
            return;  // stop execution
        }

        // logic for createOrder
        const orderId = "1234";

        if(orderId){
            setTimeout(function(){
resolve(orderId);
            },5000);
        }
    });
    return pr;
}
function validateCart(cart) {
    return cart && cart.length > 0;
}
function proceedToPayment(orderId) {
    console.log(`Proceeding to payment for order ID: ${orderId}`);
}






// const promiseOne = new Promise(function(resolve,reject){
// setTimeout(function(){
//     console.log('task is going to be completed....')
//     resolve();
// },2000)
// })



// promiseOne.then(function(){
//     console.log("Promise consumed....")
// })


// new Promise(function(resolve,reject){
//     setTimeout(function(){
//         console.log("Async task is going on ....");
//         resolve();
//     },1000)
// }).then(function(){
//     console.log("another task is also on the way..")
// })



// leetcode questions 


 function multiply(num1,num2){
    let num = Number(num1) * Number(num2);
    return num.toString();
 }
 console.log(multiply("2","3"));
 console.log(multiply("123","456"));

 // Add Binary...

 function addBinary(a,b){
    let i = a.length -  1;
    let j= b.length -1;
    let carry = 0;
    let result ="";
    while( i>=0 || j>=0 || carry >0){
        let sum = carry;

        if(i>=0) sum = sum + parseInt(a[i--]);
        if(j>=0) sum = sum + parseInt(b[j--]);

        result = (sum % 2) + result;
        carry = Math.floor(sum/2);
    }
    return result;
}

console.log(addBinary("11","1"));
console.log(addBinary("1010" , "1011"));