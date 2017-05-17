#author @ Daniel Homan
#17-05-2017
#simple program to get sum of multiples of 3 and 5

count = 0
i=0
while i<10:
    if i%3==0 or i%5==0:
        count+=i
    i=i+1

print(count)
