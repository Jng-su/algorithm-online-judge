function solution(x) {
    let sum = 0;
    let uninumber = x.toString().split('');
    
    for (let i=0; i<uninumber.length; i++){
        sum+=Number(uninumber[i]);
    }
    return x % sum == 0;
}