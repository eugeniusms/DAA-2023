import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

class RandomizedQsort {	 
	private static InputReader in;
    static PrintWriter out;

	// Driver Code 
	public static void main(String args[])  { 
		InputStream inputStream = System.in;
        in = new InputReader(inputStream);
        OutputStream outputStream = System.out;
        out = new PrintWriter(outputStream);
		Runtime runtime = Runtime.getRuntime();
        
		// KECIL RANDOM
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory1 = runtime.totalMemory() - runtime.freeMemory();
		// Input data
		int[] arr1 = new int[200];
		for (int i = 0; i < 200; i++) {
			arr1[i] = in.nextInt();
		}
		// Measure execution time
        long startTime1 = System.nanoTime();
        sort(arr1, 0, 200-1); 
        long endTime1 = System.nanoTime();
		// Measure memory usage after sorting
        System.gc();
        long afterUsedMemory1 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime1 = (endTime1 - startTime1) / 1000000;

		// Kecil Sorted
		int[] arr2 = new int[200];
		for (int i = 0; i < 200; i++) {
			arr2[i] = in.nextInt();
		}
		sort(arr2, 0, 200-1); 

		// Kecil Reversed
		int[] arr3 = new int[200];
		for (int i = 0; i < 200; i++) {
			arr3[i] = in.nextInt();
		}
		sort(arr3, 0, 200-1); 

		// Sedang Random
		int[] arr4 = new int[2000];
		for (int i = 0; i < 2000; i++) {
			arr4[i] = in.nextInt();
		}
		sort(arr4, 0, 2000-1); 

		// Sedang Sorted
		int[] arr5 = new int[2000];
		for (int i = 0; i < 2000; i++) {
			arr5[i] = in.nextInt();
		}
		sort(arr5, 0, 2000-1); 

		// Sedang Reversed
		int[] arr6 = new int[2000];
		for (int i = 0; i < 2000; i++) {
			arr6[i] = in.nextInt();
		}
		sort(arr6, 0, 2000-1); 

		// Besar Random
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory7 = runtime.totalMemory() - runtime.freeMemory();
		int[] arr7 = new int[20000];
		for (int i = 0; i < 20000; i++) {
			arr7[i] = in.nextInt();
		}
		// Measure execution time
        long startTime7 = System.nanoTime();
        sort(arr7, 0, 20000-1); 
        long endTime7 = System.nanoTime();
		// Measure memory usage after sorting
        System.gc();
        long afterUsedMemory7 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime7 = (endTime7 - startTime7) / 1000000;

		// Besar Sorted
		int[] arr8 = new int[20000];
		for (int i = 0; i < 20000; i++) {
			arr8[i] = in.nextInt();
		}
		sort(arr8, 0, 20000-1); 

		// Besar Reversed
		int[] arr9 = new int[20000];
		for (int i = 0; i < 20000; i++) {
			arr9[i] = in.nextInt();
		}
		sort(arr9, 0, 20000-1); 

		// Output results
		System.out.println("KECIL RANDOM");
        System.out.println("Execution Time: " + executionTime1 + " ms");
        System.out.println("Memory Before: " + beforeUsedMemory1 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory1 + " bytes");
		// Output results
		System.out.println("BESAR RANDOM");
        System.out.println("Execution Time: " + executionTime7 + " ms");
        System.out.println("Memory Before: " + beforeUsedMemory7 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory7 + " bytes");
	} 

	// This Function helps in calculating
	// random numbers between low(inclusive)
	// and high(inclusive) 
	static void random(int arr[],int low,int high) 
	{ 
	
		Random rand= new Random(); 
		int pivot = rand.nextInt(high-low)+low; 
		
		int temp1=arr[pivot]; 
		arr[pivot]=arr[high]; 
		arr[high]=temp1; 
	} 
	
	/* This function takes last element as pivot, 
	places the pivot element at its correct 
	position in sorted array, and places all 
	smaller (smaller than pivot) to left of 
	pivot and all greater elements to right 
	of pivot */
	static int partition(int arr[], int low, int high) 
	{ 
		// pivot is chosen randomly 
		random(arr,low,high);
		int pivot = arr[high]; 
	

		int i = (low-1); // index of smaller element 
		for (int j = low; j < high; j++) 
		{ 
			// If current element is smaller than or 
			// equal to pivot 
			if (arr[j] < pivot) 
			{ 
				i++; 

				// swap arr[i] and arr[j] 
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 

		// swap arr[i+1] and arr[high] (or pivot) 
		int temp = arr[i+1]; 
		arr[i+1] = arr[high]; 
		arr[high] = temp; 

		return i+1; 
	} 

	/* The main function that implements QuickSort() 
	arr[] --> Array to be sorted, 
	low --> Starting index, 
	high --> Ending index */
	static void sort(int arr[], int low, int high) 
	{ 
		if (low < high) 
		{ 
			/* pi is partitioning index, arr[pi] is 
			now at right place */
			int pi = partition(arr, low, high); 

			// Recursively sort elements before 
			// partition and after partition 
			sort(arr, low, pi-1); 
			sort(arr, pi+1, high); 
		} 
	} 

	/* A utility function to print array of size n */
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}