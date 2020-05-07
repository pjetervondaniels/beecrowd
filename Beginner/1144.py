n = int(input())

k: int = 0
l: int = 0

for i in range(1,n+1,1):
    print('{} {} {}'.format(i,i*i,i*i*i))
    k = i*i*+1
    l = i*i*i+1
    print('{} {} {}'.format(i,k,l))
