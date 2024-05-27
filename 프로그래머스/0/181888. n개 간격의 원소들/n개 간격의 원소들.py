def solution(num_list, n):
    answer = []
    
    for idx in range(0, len(num_list), n):
        answer.append(num_list[idx])
    
    return answer