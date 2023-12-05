import math

def two_array_xxx(X, Y, n):
    x = find_xxx(X, Y, n, 1, n)
    if x == "NOT_FOUND":
        x = find_xxx(Y, X, n, 1, n)
    return x

def find_xxx(A, B, n, low, high):
    if low > high:
        print("masuk 5")
        return "NOT_FOUND"
    else:
        k = math.floor((low+high)/2)
        print("k ==", k)
        if k == n and A[n] <= B[1]:
            print("masuk 1")
            return A[n]
        elif k < n and B[n-k] <= A[k] <= B[n-k+1]:
            print("masuk 2")
            return A[k]
        elif A[k] > B[n-k+1]:
            print("masuk 3")
            return find_xxx(A, B, n, low, k-1)
        else:
            print("masuk 4")
            return find_xxx(A, B, n, k+1, high)

X = [16, 19, 22, 25, 30, 39]
Y = [11, 20, 27, 28, 36, 40]

print(two_array_xxx(X, Y, 6))