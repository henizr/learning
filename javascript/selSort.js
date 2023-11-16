function getMinIndex(arr){
    let minIndex = 0;
    let minValue = arr[0];

    for(let i = 0; i < arr.length; i++){
        if(arr[i] < minValue){
            minValue = arr[i];
            minIndex = i;
        }
    }

    return minIndex;
}

const array = [-10000, -111000, 0, -90, 11];
const minIndex = getMinIndex(array);
console.log(minIndex);