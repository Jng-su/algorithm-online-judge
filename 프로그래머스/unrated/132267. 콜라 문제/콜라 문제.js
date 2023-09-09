function solution(a, b, n) {
    // 리턴할 변수
    let result = 0;

    while (n >= a) {
        const cola = Math.floor(n / a) * b; // 콜라를 받음
        result += cola;

        // 남은 빈 병과 새로 받은 콜라를 더함
        n = cola + (n % a);
    }

    return result;
}