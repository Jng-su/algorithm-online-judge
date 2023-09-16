function solution(n, m) {
    let gcd = 0; // 최대공약수
    let lcm = 0; // 최소공배수
    
    let max = n>m?n:m;
    let min = n<m?n:m;
    
    for (let i=min; i>=1; i--){
        if(n%i==0 && m%i==0){
            gcd=i;
            break;
        }
    }
    lcm = (n*m)/gcd;
    
    return [gcd, lcm];
}