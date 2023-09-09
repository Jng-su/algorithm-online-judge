function solution(n) {
    const isPrime = Array(n + 1).fill(true); 
    isPrime[0] = isPrime[1] = false;

    for (let p = 2; p * p <= n; p++) {
        if (isPrime[p]) {
            for (let i = p * p; i <= n; i += p) {
                isPrime[i] = false;
            }
        }
    }

    let primeCount = 0;

    for (let i = 2; i <= n; i++) {
        if (isPrime[i]) {
            primeCount++;
        }
    }

    return primeCount;
}