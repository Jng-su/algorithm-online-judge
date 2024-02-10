function solution(array, height) {
    let count = 0;
    array.map(index => index > height ? count++ : null);
    return count;
}