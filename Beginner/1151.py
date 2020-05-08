def fibonacci(n):
    if n <= 1:
        return n
    return fibonacci(n-1) + fibonacci(n - 2)

n = -1

while n < 0  or  n > 46 :
    n = int(input())

print('{}'.format(fibonacci(n)))

