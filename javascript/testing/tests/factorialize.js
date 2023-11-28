function factorialize(number){
    let result = number;

    while(number > 1){
        number --;
        result *= number;
    }

    return result;
}

 export {factorialize}