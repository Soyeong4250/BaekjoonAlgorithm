cnt = int(input())
heap = []
word1 = []
word2 = []

for i in range(cnt):
    if len(word1) == 0:
        word1 = input()
        word2 = list(input())
    else:
        word2 = []
        word2 = list(input())

    for j in range(len(word1)):
        if word1[j] == word2[j]:
            heap.append(word1[j])
        else:
            heap.append("?")
    word1 = []
    word1.append(heap)
    heap = []

    print(word1)
