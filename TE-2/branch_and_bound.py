import math
import time
import tracemalloc

def partition(values, start_index, total_value, unassigned_value, test_assignment, test_value, best_assignment, best_err):
    # If start_index is beyond the end of the array,
    # then all entries have been assigned.
    if start_index >= len(values):
        # We're done. See if this assignment is better than
        # what we have so far.
        test_err = abs(2 * test_value - total_value)
        if test_err < best_err[0]:
            # This is an improvement. Save it.
            best_err[0] = test_err
            best_assignment[:] = test_assignment[:]

            # print(best_err[0])
    else:
        # See if there's any way we can assign
        # the remaining items to improve the solution.
        test_err = abs(2 * test_value - total_value)
        if test_err - unassigned_value < best_err[0]:
            # There's a chance we can make an improvement.
            # We will now assign the next item.
            unassigned_value -= values[start_index]

            # Try adding values[start_index] to set 1.
            test_assignment[start_index] = True
            partition(values, start_index + 1,
                total_value, unassigned_value,
                test_assignment, test_value + values[start_index],
                best_assignment, best_err)

            # Try adding values[start_index] to set 2.
            test_assignment[start_index] = False
            partition(values, start_index + 1,
                total_value, unassigned_value,
                test_assignment, test_value,
                best_assignment, best_err)

# Example usage:
if __name__ == "__main__":
    # Membaca file
    file_name = "TE-2/Datasets/sedang_random.txt"
    print(f"Dataset: {file_name}")
    file_input = open(file_name)
    file_content = file_input.read() 
    file_input.close()

    values_raw = file_content.split("\n")
    values = [eval(i) for i in values_raw]

    start_index = 0
    total_value = sum(values)
    unassigned_value = total_value
    test_assignment = [False] * len(values)
    test_value = 0
    best_assignment = [False] * len(values)
    best_err = [float('inf')]

    # Record start time and memory
    start_time = time.time()
    tracemalloc.start()

    # Call the partition function
    partition(values, start_index, total_value, unassigned_value, test_assignment, test_value, best_assignment, best_err)

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