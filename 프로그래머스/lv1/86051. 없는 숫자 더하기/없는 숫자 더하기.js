function solution(numbers) {
    let missingSum = 0;

    for (let i = 0; i <= 9; i++) {
        let found = false;
        for (let j = 0; j < numbers.length; j++) {
            if (numbers[j] === i) {
                found = true;
                break;
            }
        }
        if (!found) {
            missingSum += i;
        }
    }

    return missingSum;
}