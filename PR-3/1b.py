import math

def two_array_xxx(X, Y, n):
    x = find_xxx(X, Y, n, 0, n-1)
    if x == "NOT_FOUND":
        x = find_xxx(Y, X, n, 0, n-1)
    return x

def find_xxx(A, B, n, low, high):
    if low > high:
        print("masuk 5")
        return "NOT_FOUND"
    else:
        k = math.floor((low+high)/2)
        print("k ==", k)
        if k == n and A[n] <= B[0]:
            print("masuk 1")
            return A[n]
        elif k < n and B[n-k-1] <= A[k] <= B[n-k]:
            print("masuk 2")
            return A[k]
        elif A[k] > B[n-k]:
            print("masuk 3")
            return find_xxx(A, B, n, low, k-1)
        else:
            print("masuk 4")
            return find_xxx(A, B, n, k+1, high)

X = [16, 19, 22, 25, 30, 39]
Y = [11, 20, 27, 28, 36, 40]

print(two_array_xxx(X, Y, 4))