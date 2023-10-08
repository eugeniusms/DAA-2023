import math

def count(n):
    k = math.sqrt(n)

    su = []
    for s in range(int(k)+1):
        su.append(0)

    for j in range(1, int(k)+1):
        su[j] = 0
        
        for i in range(1, j**2+1):
            su[j] = su[j] + i

    return su[1:]

print(count(16))