

function maxandMin(arr){
    let max = arr[0];
    let min = arr[0];


    for(let i= 1 ; i<arr.length ; i++){
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
    }
    return {max , min};
}
console.log(maxandMin([3,2,4,1,-6,-7]));