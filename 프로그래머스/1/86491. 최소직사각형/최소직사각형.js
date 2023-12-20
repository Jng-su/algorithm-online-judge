function solution(sizes) {
    let maxW = 0;
    let maxH = 0;

    for (const size of sizes) {
        const [w, h] = size[0] > size[1] ? size : size.reverse();
        if (w > maxW) {
            maxW = w;
        }
        if (h > maxH) {
            maxH = h;
        }
    }
    return maxW * maxH;
}