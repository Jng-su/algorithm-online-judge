function solution(k, m, score) {
    if (m > score.length) {
        return 0; // m이 score 배열의 길이보다 크면 0을 반환
    }
    // score 에 해당하는 숫자들을 배열로 저장
    // 오름차순 / 내림차순으로 정렬
    // m 만큼 뒤 혹은 앞에서 짜르고 m 만큼 작으면 폐기
    let result = 0;
    score.sort((a,b)=>b-a) // 내림차순 정렬
    
    for (let i=0; i+m<=score.length; i+=m) {
        let box = score.slice(i, i + m);
        let p = box[m-1];
        let profit = p * m;
        
        result += profit;
    }
    return result;
}