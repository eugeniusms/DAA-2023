def mistery(m, A):
    x = 0
    i = 0
    while (i < len(A)):
        temp = abs(A[i] - m)
        if (temp > x):
            x = temp
        i += 1
    return x

print(mistery(3, [2, 10, 6, 5, 9]))
print(mistery(7, [2, 10, 6, 5, 9]))