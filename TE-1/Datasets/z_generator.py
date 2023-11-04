import random

# inisialisasi variabel penyimpan data
besar_random = ""
besar_reversed = ""
besar_sorted = ""
kecil_random = ""
kecil_reversed = ""
kecil_sorted = ""
sedang_random = ""
sedang_reversed = ""
sedang_sorted = ""

# generator kecil
counter = 0
rev_counter = 200
for i in range(200):
    # random
    kecil_random += str(random.randint(1,1000)) + "\n"
    # kecil sorted
    counter += 1
    kecil_sorted += str(counter) + "\n"
    # kecil reversed
    kecil_reversed += str(rev_counter) + "\n"
    rev_counter -= 1

# generator sedang
counter = 0
rev_counter = 2000
for i in range(2000):
    # random
    sedang_random += str(random.randint(1,10000)) + "\n"
    # sedang sorted
    counter += 1
    sedang_sorted += str(counter) + "\n"
    # sedang reversed
    sedang_reversed += str(rev_counter) + "\n"
    rev_counter -= 1

# generator besar 
counter = 0
rev_counter = 20000
for i in range(20000):
    # random
    besar_random += str(random.randint(1,100000)) + "\n"
    # kecil sorted
    counter += 1
    besar_sorted += str(counter) + "\n"
    # kecil reversed
    besar_reversed += str(rev_counter) + "\n"
    rev_counter -= 1

# menulis text yang sudah dioperasikan ke dalam text output
# kecil
my_file = open("kecil_random.txt", mode='w')
print(kecil_random, file=my_file)
my_file.close()
my_file = open("kecil_sorted.txt", mode='w')
print(kecil_sorted, file=my_file)
my_file.close()
my_file = open("kecil_reversed.txt", mode='w')
print(kecil_reversed, file=my_file)
my_file.close()

# sedang
my_file = open("sedang_random.txt", mode='w')
print(sedang_random, file=my_file)
my_file.close()
my_file = open("sedang_sorted.txt", mode='w')
print(sedang_sorted, file=my_file)
my_file.close()
my_file = open("sedang_reversed.txt", mode='w')
print(sedang_reversed, file=my_file)
my_file.close()

# besar
my_file = open("besar_random.txt", mode='w')
print(besar_random, file=my_file)
my_file.close()
my_file = open("besar_sorted.txt", mode='w')
print(besar_sorted, file=my_file)
my_file.close()
my_file = open("besar_reversed.txt", mode='w')
print(besar_reversed, file=my_file)
my_file.close()