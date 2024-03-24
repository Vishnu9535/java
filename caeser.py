s = "all the best"
f = ""
for i in s:
    if i != ' ':
        k = ord(i) + 1
        f = f + chr(k)
    if i == ' ':
        f = f + i
print(f)