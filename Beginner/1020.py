days = int(input())

years = int(days/365)
month = int((days - years * 365) / 30)
day = int((days - (years * 365) - (month * 30)))

print("{} ano(s)".format(years))
print("{} mes(es)".format(month))
print("{} dia(s)".format(day))