current_time = input().split()
hour = int(current_time[0])
minute = int(current_time[1])
cook_time = int(input())

minute += cook_time

while minute >= 60:
    minute -= 60
    hour += 1
    if hour == 24:
        hour = 0

print(hour, minute)