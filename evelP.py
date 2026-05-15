# # while + if/elif + break/continue를 사용하세요.
# # 투입 금액을 정수로 입력 받는다
# money = int(input("잔액 입력:"))

# # 이어서 메뉴를 출력하고 음료 번호를 입력 받음
# # 반복 진입 시 4줄 출력
# # 잔액: 값원/1. 물 (500원)/2. 주스 (1000원)
# # 3. 커피 (1500원)뒤 음료 선택 입력.
# while True:
#     print(f"잔액: {money}원")
#     print("1. 물 (500원)")
#     print("2. 주스 (1000원)")
#     print("3. 커피 (1500원)")
#     # 번호 입력받고 번호에 맞게 출력
#     # 선택이 1/2/3이 아니면 잘못된 선택입니다.출력 후
#     # 다시 반복(contineu,잔액 차감X)
#     num = int(input("번호 입력:"))
#     money >= price
#     if num == 1:
#         print("물을 선택했습니다.")
#         price == 500
#         money = money - price
#     elif num == 2:
#         print("주스를 선택했습니다.")
#         price = 1000
#         money = money - price
#     elif num == 3:
#         print("커피를 선택했습니다.")
#         price = 1500
#         money = money - price
#     else:
#         print("잘못된 선택입니다.")
#         print(f"잔액: {money}원")
#         continue
#     if money < 500:
#         print("잔액이 부족합니다.")
#         break
# print(f"남은 금액:{money}원")






# 선택이 유효하면 잔액>=가격이면 잔액 차감 후
# X를 선택했습니다. 출력 그렇지 않으면 잔액이 부족합니다. 후
# break




# 1부터 num까지 반복하며 나머지가 0이면 약수
num = int(input("입력:"))
count = 0
# 숫자를 입력받아 그 숫자의 약수를 한 줄에 하나씩 오름차순으로 출력
# 약수구하기
for i in range(1,num+1):
    if num % i == 0:
        count += 1
# 마지막에 "약수의 개수: N" 형태로 약수의 개수를 출력
print("약수의 개수:", count)

# 1부터 num까지 반복하고 입력받은 숫자의 약수를 한 줄에 하나씩
# 오름차순으로 출력하고, 마지막에 약수의 개수 출력
