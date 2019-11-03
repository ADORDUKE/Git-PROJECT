
print('Введите координаты концов первого отрезка.')
x1_1 = int(input('Первая точка x = '))
y1_1 = int(input('             y = '))
x1_2 = int(input('Вторая точка x = '))
y1_2 = int(input('             y = '))
print('Введите координаты концов второго отрезка.')
x2_1 = int(input('Первая точка x = '))
y2_1 = int(input('             y = '))
x2_2 = int(input('Вторая точка x = '))
y2_2 = int(input('             y = '))



def point(x, y):
    if min(x1_1, x1_2) <= x <= max(x1_1, x1_2):
        print("Отрезки пересекаются")
    else:
        print("Не пересекаются")

A1 = y1_1 - y1_2
B1 = x1_2 - x1_1
C1 = x1_1 * y1_2 - x1_2 * y1_1
A2 = y2_1 - y2_2
B2 = x2_2 - x2_1
C2 = x2_1 * y2_2 - x2_2 * y2_1

if B1 * A2 - B2 * A1 and A1:
    y = (C2 * A1 - C1 * A2) / (B1 * A2 - B2 * A1)
    x = (-C1 - B1 * y) / A1
    point(x, y)
elif B1 * A2 - B2 * A1 and A2:
    y = (C2 * A1 - C1 * A2) / (B1 * A2 - B2 * A1)
    x = (-C2 - B2 * y) / A2
    point(x, y)
else:
    print("Отрезки параллельны")