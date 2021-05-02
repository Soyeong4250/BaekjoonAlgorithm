# Stack 생성
class Stack:
    # 리스트를 이용하여 스택 생성
    def __init__(self):
        self.top = []
        # top 변수 안에는 파이썬에 내장되어 있는 리스트(list)를 이용하여 스택을 만들어줌

    # 스택의 크기 출력
    def __len__(self):
        return len(self.top)

    # 스택 내부 자료를 string으로 변환하여 반환
    def __str__(self):
        return str(self.top[::-1])

# 구현 함수
    # PUSH
    def push(self, item):
        self.top.append(item)
        # 파이썬 list에 내장되어 있는 append함수를 사용하여 리스트 끝에 값을 추가

    # POP
    def pop(self):
        # if Stack is not empty
        if not self.isEmpty():
            # isEmpty()를 호출하여 스택이 비어있는지 확인
            # pop and return
            return self.top.pop(-1)  # pop()에 -1 인자를 넘겨 리스트 가장 마지막에 있는 데이터 꺼내기
        else:
            print("Stack underflow")
            exit()

    # CLEAR
    # 스택 초기화
    def clear(self):
        self.top = []
        # Stack클래스의 멤버변수인 top을 새로운 리스트로 초기화
        # 기존의 top에 있던 모든 데이터는 더이상 포인팅 할 수 x

    # isContain
    # 자료가 포함되어 있는지 여부 확인
    def isContain(self, item):
        return item in self.top

    # peek
    # 스택에서 top의 값을 읽어온다
    def peek(self):
        if not self.isEmpty():
            return self.top[-1]
            # 리스트 인덱싱을 이용하여 top리스트의 가장 마지막 원소(자료)를 반환
        else:
            print("underflow")
            exit()

    # isEmpty
    # 스택이 비어있는지 확인
    def isEmpty(self):
        return len(self.top) == 0

    # size
    # 스택 크기 반환
    def size(self):
        return len(self.top)
