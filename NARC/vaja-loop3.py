vsota=0
cena=1
stevec=0
while cena != 0:
    cena = int(input("Vnesi ceno: "))
    vsota=vsota+cena
    stevec=stevec+1

print(vsota/stevec-1)