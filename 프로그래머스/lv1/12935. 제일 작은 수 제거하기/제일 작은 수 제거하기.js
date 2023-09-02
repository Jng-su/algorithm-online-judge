function solution(arr) {
    if (arr.length === 1) {
        return [-1];
    }

    let minIndex = 0;
    let minValue = arr[0];

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < minValue) {
            minIndex = i;
            minValue = arr[i];
        }
    }

    arr.splice(minIndex, 1);

    return arr;
}