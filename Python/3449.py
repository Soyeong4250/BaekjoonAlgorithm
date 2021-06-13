T = int(input())

for _ in range(T):
    A = input()
    B = input()
    cnt = 0

    for i in range(len(A)):
        if A[i] != B[i]:
            cnt += 1
    print("Hamming distance is %d." % cnt)
