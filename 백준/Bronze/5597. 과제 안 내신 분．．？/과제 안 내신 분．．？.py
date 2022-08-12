num = []
count = []
for i in range(1,31):
    num.append(i)

for i in range(1,29):
    count.append(int(input()))

num1 = set(num)
num2 = set(count)
num1 = num1.difference(num2)
num1 = list(num1)
num1.sort()

print(str(num1[0])+'\n'+str(num1[1]))