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

		// Kecil Random
		int[] arr1 = new int[200];
		for (int i = 0; i < 200; i++) {
			arr1[i] = in.nextInt();
		}
		sort(arr1, 0, 200-1); 

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
		for (int i = 0; i < 200; i++) {
			arr4[i] = in.nextInt();
		}
		sort(arr4, 0, 2000-1); 

		// Sedang Sorted
		int[] arr5 = new int[2000];
		for (int i = 0; i < 200; i++) {
			arr5[i] = in.nextInt();
		}
		sort(arr5, 0, 2000-1); 

		// Sedang Reversed
		int[] arr6 = new int[2000];
		for (int i = 0; i < 200; i++) {
			arr6[i] = in.nextInt();
		}
		sort(arr6, 0, 2000-1); 

		// Besar Random
		int[] arr7 = new int[20000];
		for (int i = 0; i < 200; i++) {
			arr7[i] = in.nextInt();
		}
		sort(arr7, 0, 20000-1); 

		// Besar Sorted
		int[] arr8 = new int[20000];
		for (int i = 0; i < 200; i++) {
			arr8[i] = in.nextInt();
		}
		sort(arr8, 0, 20000-1); 

		// Besar Reversed
		int[] arr8 = new int[20000];
		for (int i = 0; i < 200; i++) {
			arr8[i] = in.nextInt();
		}
		sort(arr8, 0, 20000-1); 
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