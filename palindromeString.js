

function palindrome(str){
    let result = "";

    for ( let i = str.length -1 ; i>=0;i--){
        result += str[i];
        
    }
    console.log(result);
    if( result === str){
        return true;
    }else{
        return false;
    }
}

console.log(palindrome("olo"));
