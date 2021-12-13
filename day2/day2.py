#Day 2
with open('advent_of_code21/day2/day2.txt') as f:

    lines = f.readlines()
    phrase = ""
    i = 0
    hor = 0
    depth = 0
    for line in lines:
        phrase = line
        arr = phrase.split()

        for i in range(len(arr)):
            if arr[0] == "forward":
                hor += int(arr[1])/2
            elif arr[0] == "down":
                depth += int(arr[1])/2
            elif arr[0] == "up":
                depth -= int(arr[1])/2
            i += 1
        print("DEPTH: ", depth, " , HORIZONTAL: ", hor)
        print("FINAL: ", (depth*hor))