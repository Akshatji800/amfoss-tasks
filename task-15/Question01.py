import sys
s=0
t=int(input())
for i in range(t):
    n=int(input())
    n-=1
    n3=n//3
    n5=n//5
    n15=n//15
    s=((n3*3*(n3+1))//2)+((n5*5*(n5+1))//2)-((n15*15*(n15+1))//2)
    print(s)
    s=0
