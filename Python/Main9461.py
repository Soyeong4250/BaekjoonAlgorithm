def padovan():
    p = [1, 1, 1]
    for i in range(3, 100):
        p.append(p[i-2] + p[i-3])
    return p
    
p = padovan()
T = int(input())

for t in range(0, T):
    n = int(input())-1
    print(p[n])