# bar = [10, 20, 30, 40]

# print(bar[0]) 
# print(bar[3])
# print(bar[2])
# print(bar[1])

# std_score = [100, 90, 70, 50, 80, 79, 90]

# total = 0
# for score in std_score:
#     total += score

# # print(total)
# for db in range(4):
#     for table in range(1): # tensor
#         for row in range(1): #vector -> matrix
#             for col in range(2): #vector
#                 print("*", end ="")
#             
# score = [
#    [10, 20, 30],
#    [40, 50, 60],
#    [70, 80, 90]   
# ]

# # 첫 포문은 학생부터
# for row in range(3) : #학생별 순회 > row, [0,1,2]
#     for col in range(3):#과목별 순회 > col [0,1,2]
#         print(f"{score[row][col]}\t", end="")
#     print()
# 첫줄 row값 둘 col값

# bar = [ # 4 X 3 4행 3열
#     [1,2,3],
#     [4,5,6],
#     [10, 20, 30],
#     [40, 50, 60],
#     ]
 
# print(bar[3][0])


# 메뉴 선택
# 1 라떼
# 2 아메리카노
# 3 델몬트
# 4 종료
# TC : 1, 2, 2, 4 -> 라떼 1개 아메리카노2개
latte = 0
amricano = 0
delmont = 0 

# 메뉴선택 입력받기
# 4 선택시 종료(break) 그 전까지는 반복
while True:
    # 메뉴 출력
    print("메뉴 선택")
    print("1 라떼")
    print("2 아메리카노")
    print("3 델몬트")
    print("4 종료")
    # 메뉴 선택
    menu = int(input("선택:"))
    # 1 선택시 라떼 += 1
    if menu == 1:
        latte += 1
        print("1 라떼")
    # 2 선택시 아메리카노 += 1
    elif menu == 2:
        amricano += 1
        print("2 아메리카노")
    # 3 선택시 델몬트 += 1
    elif menu == 3:
        delmont += 1
        print("3 델몬트")
    # 4 선택시 종료
    elif menu == 4:
        break
# 1,3,3 선택시 라떼1개 델몬트2개 출력 (0개는 출력X)
if latte > 0:
    print(f"라떼: {latte}개")
if amricano > 0:
    print(f"아메리카노: {amricano}개")
if delmont > 0:
    print(f"델몬트: {delmont}개")


# scalar
# vector
bar = [3,4,1,2]
# matrix
foo = [[2,3],[4,5]]

# len(),enmerate()
