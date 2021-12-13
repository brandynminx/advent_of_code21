#PART 2
with open('advent_of_code21/day1/day1.txt') as f:

    lines = f.readlines()
    i = 0
    f = 1
    sum1 = 0
    sum2 = 0
    count = 0

    while i < len(lines):
        for item in lines[i:i+3]:
            sum2 += int(item)
        print("SUM1 ", sum1, "\n", "SUM2 ", sum2)

        if sum1 == 0:
            count = count
        elif sum1 < sum2:
            count += 1
            print("Increased")
        else:
            count = count
        sum1 = sum2
        sum2 = 0
        i += 1
    print(count)