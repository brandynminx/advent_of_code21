#Day 2 part 2
with open('advent_of_code21/day2/day2pt2.txt') as f:

    lines = f.readlines()
    phrase = ""
    i = 0
    aim = 0
    hor = 0
    depth = 0
    for line in lines:
        phrase = line
        arr = phrase.split()

        for i in range(len(arr)):
            if arr[0] == "forward":
                hor += int(arr[1])/2
                depth = depth + (aim * int(arr[1])/2)
            elif arr[0] == "down":
                aim += int(arr[1])/2
            elif arr[0] == "up":
                aim -= int(arr[1])/2
            i += 1
        print("DEPTH: ", depth, " , HORIZONTAL: ", hor, " AIM: ", aim)
        print("FINAL: ", (depth*hor))