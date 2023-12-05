import time
import tracemalloc

# Dynamic Programming based python
# program to partition problem
 
# Returns true if arr[] can be
# partitioned in two subsets of
# equal sum, otherwise false
 
def partition(arr, n):
    sum = 0
    i, j = 0, 0
 
    # calculate sum of all elements
    for i in range(n):
        sum += arr[i]
 
    if sum % 2 != 0:
        return False
 
    part = [[True for i in range(n + 1)]
            for j in range(sum // 2 + 1)]
 
    # initialize top row as true
    for i in range(0, n + 1):
        part[0][i] = True
 
    # initialize leftmost column,
    # except part[0][0], as 0
    for i in range(1, sum // 2 + 1):
        part[i][0] = False
 
    # fill the partition table in
    # bottom up manner
    for i in range(1, sum // 2 + 1):
 
        for j in range(1, n + 1):
            part[i][j] = part[i][j - 1]
 
            if i >= arr[j - 1]:
                part[i][j] = (part[i][j] or
                              part[i - arr[j - 1]][j - 1])
 
    return part[sum // 2][n]
 
 
# Example usage:
if __name__ == "__main__":
    # Membaca file
    file_name = "TE-2/Datasets/besar_random.txt"
    print(f"Dataset: {file_name}")
    file_input = open(file_name)
    file_content = file_input.read() 
    file_input.close()

    values_raw = file_content.split("\n")
    values = [eval(i) for i in values_raw]
    n = len(values)

    # Record start time and memory
    start_time = time.time()
    tracemalloc.start()

    result = partition(values, n)
    
    # # Function call
    # if result == True:
    #     print("Can be divided into two",
    #         "subsets of equal sum")
    # else:
    #     print("Can not be divided into ",
    #         "two subsets of equal sum")

    # Record end time
    end_time = time.time()

    # Calculate and print the running time
    running_time = end_time - start_time
    print(f"Running time: {running_time} seconds")

    # Selesai eksekusi program
    # Dapatkan statistik alokasi memori
    memory_stats = tracemalloc.get_traced_memory()
    
    # Stopping the library
    tracemalloc.stop()

    # Tampilkan hasilnya
    print("Memory used:", memory_stats[0], "bytes")
    print("Total allocated memory:", memory_stats[1], "bytes")
    
# This code is contributed
# by mohit kumar 29