import random

# inisialisasi variabel penyimpan data
besar_random = ""
kecil_random = ""
sedang_random = ""

# generator kecil
for i in range(10):
    kecil_random += str(random.randint(1,10000)) + "\n"

# generator sedang
for i in range(40):
    sedang_random += str(random.randint(1,10000)) + "\n"

# generator besar 
for i in range(80):
    besar_random += str(random.randint(1,100000)) + "\n"

# menulis text yang sudah dioperasikan ke dalam text output
# kecil
my_file = open("kecil_random.txt", mode='w')
print(kecil_random, file=my_file)
my_file.close()

# sedang
my_file = open("sedang_random.txt", mode='w')
print(sedang_random, file=my_file)
my_file.close()

# besar
my_file = open("besar_random.txt", mode='w')
print(besar_random, file=my_file)
my_file.close()