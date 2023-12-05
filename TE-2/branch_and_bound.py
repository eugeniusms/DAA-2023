import math

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

            print(best_err[0])
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
values = [1879, 3434, 4407, 2404, 4591, 3055, 2263, 8412, 6360, 4334]
start_index = 0
total_value = sum(values)
unassigned_value = total_value
test_assignment = [False] * len(values)
test_value = 0
best_assignment = [False] * len(values)
best_err = [float('inf')]

partition(values, start_index, total_value, unassigned_value, test_assignment, test_value, best_assignment, best_err)
