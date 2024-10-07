def Solution_1849A():
    for t in range(int(input())):
        b, c, h = map(int, input().split())
        if b-1<c+h:
            print(2*(b-1)+1)
        else:
            print(2*(c+h)+1)


Solution_1849A()