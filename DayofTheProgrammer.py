#!/bin/python

#/*
#author@ Daniel Homan
#17-05-2017
#Day Of the Programmer occurs on the 256th day of the year .
#In Russia, they switched to the Gregorian calender from the
#Julain calender in 1918. After January 31st 1918, the next day
#was February 14th. Find what date the Day Of the Programmer occurs
#in Russia based on an inputted year.


import sys

def solve(year):
    days = 0

    if(year<1919):
        if(year%4==0):
            days=29
        else:
            days = 28
        if(year==1918):
            days = days-13

    if(year>1918):
        if(year%400==0 or (year%4==0 and year%100!=0)):
            days = 29
        else:
            days = 28

    sum = 31+days+31+30+31+30+31+31
    date = 256-sum
    return str(date)+".09."+str(year)


year = int(raw_input().strip())
result = solve(year)
print(result)
