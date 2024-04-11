def gcd(denom1, denom2):
    while denom2 > 0:
        denom1, denom2 = denom2, denom1 % denom2
    return denom1

def solution(numer1, denom1, numer2, denom2):
    new_numer = numer1 * denom2 + numer2 * denom1
    new_denom = denom1 * denom2
    gcd_value = gcd(new_numer, new_denom)
    lcm_value = gcd_value * (new_numer // gcd_value) * (new_denom // gcd_value)
    return [new_numer // gcd_value, new_denom // gcd_value]