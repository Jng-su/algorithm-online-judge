function solution(s) {
    let answer = '';
    let length = s.length;

    if (length % 2 === 0) {
        let middleIndex = length / 2;
        answer = s[middleIndex - 1] + s[middleIndex];
    } else {
        let middleIndex = Math.floor(length / 2);
        answer = s[middleIndex];
    }

    return answer;
}