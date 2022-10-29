import sys

cnt = int(sys.stdin.readline())  # 몇 번 실행할 것인지
stack = list()  # 스택 리스트
icon = list()  # +,- 기호를 담을 리스트
count = 1
result = True  # 메세지 출력 변수 초기화

for i in range(cnt):
    x = int(sys.stdin.readline())
    while count <= x:  # x에 4를 입력할 경우
        stack.append(count)  # stack에 4이하의 수가 추가되고
        icon.append('+')  # icon에 +가 4번까지 추가
        count += 1  # count=4가 될때까지 1씩 커지면서 반복

    if (stack[-1] == x):
        stack.pop(-1)
        icon.append('-')
    else:
        result = False  # 할당

if result == False:
    print("NO")
else:
    for i in icon:
        print(i)
