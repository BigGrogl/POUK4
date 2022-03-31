nterms = int(input("Stevilo cifr? "))

n1, n2 = 0, 1
count = 0


if nterms <= 0:
   print("Vnesi pozitivno stevilo: ")
elif nterms == 1:
   print("Sekvenca do ",nterms,": ")
   print(n1)
else:
   print("Sekvenca:")
   while count < nterms:
       print(n1)
       nth = n1 + n2
       n1 = n2
       n2 = nth
       count += 1