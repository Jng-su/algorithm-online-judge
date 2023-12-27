function solution(s) {
    const answer = [];
    const lastIndexMap = {};
    for (let i = 0; i < s.length; i++) {
        const currentChar = s[i];
        if (lastIndexMap[currentChar] === undefined) {
            answer.push(-1);
        } else {
            const lastIndex = lastIndexMap[currentChar];
            const distance = i - lastIndex;
            answer.push(distance);
        }
        lastIndexMap[currentChar] = i;
    }
    return answer;
}
