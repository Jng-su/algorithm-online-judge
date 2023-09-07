function solution(phone_number) {
    let hidden = '*'.repeat(phone_number.length-4);
    return hidden+phone_number.slice(-4);
}