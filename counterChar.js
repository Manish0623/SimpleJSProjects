

function char(str , ch){
    let count = 0;

    for ( let i = 0 ; i<str.length ; i++){
    if( str[i] === ch){
        count++;
    }
}
return count;
}
console.log(char("what the hell " , "l"));