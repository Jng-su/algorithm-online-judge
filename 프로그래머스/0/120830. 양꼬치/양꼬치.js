function solution(n, k) {
    const yakitoriPrice = 12000;
    const drinkPrice = 2000;
    const yakitoriCost = n * yakitoriPrice;
    const drinkCost = k * drinkPrice;
    const totalCost = yakitoriCost + drinkCost - (Math.floor(n / 10) * drinkPrice);
    
    return totalCost;
}
