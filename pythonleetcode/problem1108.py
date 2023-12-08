class p1108:
    def defang(self, address : str) -> str:
        a=""
        for i in address:
            if i == ".":
                a=a+"[.]"
            else:
                a=a+i
        return a
    
a = p1108()
print(a.defang("1.1.1.1"))