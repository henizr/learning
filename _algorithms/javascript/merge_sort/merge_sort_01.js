function merge(left, right){
    let arr = [];

    while(left.length && right.length){
        if(left[0] < right[0]){
            arr.push(left.shift());
        }
        else{
            arr.push(right.shift());
        }
    }

    return [...arr, ...left, ...right];
}

function mergeSort(arr){
    const half = arr.length / 2;

    if(arr.length < 2){
        return arr;
    }

   
    const left = arr.splice(0, half);

    return merge(mergeSort(left), mergeSort(arr));ya

}

const array = [10000, 100, 10, -90, 0];
const sortedArray = mergeSort(array);
console.log(sortedArray);