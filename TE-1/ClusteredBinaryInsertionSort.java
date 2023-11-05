import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class ClusteredBinaryInsertionSort {
    private static InputReader in;
    static PrintWriter out;

    // Driver Code
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        in = new InputReader(inputStream);
        OutputStream outputStream = System.out;
        out = new PrintWriter(outputStream);
		System.gc();
		Runtime runtime = Runtime.getRuntime();
        
		// KECIL RANDOM
		// Input data
		int[] arr1 = new int[200];
		for (int i = 0; i < 200; i++) {
			arr1[i] = in.nextInt();
		}
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory1 = runtime.totalMemory() - runtime.freeMemory();
		// Measure execution time
        long startTime1 = System.nanoTime();
        clusteredBinaryInsertionSort(arr1); 
        long endTime1 = System.nanoTime();
		// Measure memory usage after sorting
        long afterUsedMemory1 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime1 = (endTime1 - startTime1);

		// Kecil Sorted
		int[] arr2 = new int[200];
		for (int i = 0; i < 200; i++) {
			arr2[i] = in.nextInt();
		}
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory2 = runtime.totalMemory() - runtime.freeMemory();
		// Measure execution time
        long startTime2 = System.nanoTime();
        clusteredBinaryInsertionSort(arr2); 
        long endTime2 = System.nanoTime();
		// Measure memory usage after sorting
        long afterUsedMemory2 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime2 = (endTime2 - startTime2); 

		// Kecil Reversed
		int[] arr3 = new int[200];
		for (int i = 0; i < 200; i++) {
			arr3[i] = in.nextInt();
		}
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory3 = runtime.totalMemory() - runtime.freeMemory();
		// Measure execution time
        long startTime3 = System.nanoTime();
        clusteredBinaryInsertionSort(arr3); 
        long endTime3 = System.nanoTime();
		// Measure memory usage after sorting
        long afterUsedMemory3 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime3 = (endTime3 - startTime3); 

		// Sedang Random
		int[] arr4 = new int[2000];
		for (int i = 0; i < 2000; i++) {
			arr4[i] = in.nextInt();
		}
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory4 = runtime.totalMemory() - runtime.freeMemory();
		// Measure execution time
        long startTime4 = System.nanoTime();
        clusteredBinaryInsertionSort(arr4); 
        long endTime4 = System.nanoTime();
		// Measure memory usage after sorting
        long afterUsedMemory4 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime4 = (endTime4 - startTime4); 

		// Sedang Sorted
		int[] arr5 = new int[2000];
		for (int i = 0; i < 2000; i++) {
			arr5[i] = in.nextInt();
		}
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory5 = runtime.totalMemory() - runtime.freeMemory();
		// Measure execution time
        long startTime5 = System.nanoTime();
        clusteredBinaryInsertionSort(arr5); 
        long endTime5 = System.nanoTime();
		// Measure memory usage after sorting
        long afterUsedMemory5 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime5 = (endTime5 - startTime5); 

		// Sedang Reversed
		int[] arr6 = new int[2000];
		for (int i = 0; i < 2000; i++) {
			arr6[i] = in.nextInt();
		}
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory6 = runtime.totalMemory() - runtime.freeMemory();
		// Measure execution time
        long startTime6 = System.nanoTime();
        clusteredBinaryInsertionSort(arr6); 
        long endTime6 = System.nanoTime();
		// Measure memory usage after sorting
        long afterUsedMemory6 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime6 = (endTime6 - startTime6); 

		// Besar Random
		int[] arr7 = new int[20000];
		for (int i = 0; i < 20000; i++) {
			arr7[i] = in.nextInt();
		}
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory7 = runtime.totalMemory() - runtime.freeMemory();
		// Measure execution time
        long startTime7 = System.nanoTime();
        clusteredBinaryInsertionSort(arr7); 
        long endTime7 = System.nanoTime();
		// Measure memory usage after sorting
        long afterUsedMemory7 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime7 = (endTime7 - startTime7);

		// Besar Sorted
		int[] arr8 = new int[20000];
		for (int i = 0; i < 20000; i++) {
			arr8[i] = in.nextInt();
		}
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory8 = runtime.totalMemory() - runtime.freeMemory();
		// Measure execution time
        long startTime8 = System.nanoTime();
        clusteredBinaryInsertionSort(arr8); 
        long endTime8 = System.nanoTime();
		// Measure memory usage after sorting
        long afterUsedMemory8 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime8 = (endTime8 - startTime8);

		// Besar Reversed
		int[] arr9 = new int[20000];
		for (int i = 0; i < 20000; i++) {
			arr9[i] = in.nextInt();
		}
		// Measure memory usage before sorting
		System.gc();
        long beforeUsedMemory9 = runtime.totalMemory() - runtime.freeMemory();
		// Measure execution time
        long startTime9 = System.nanoTime();
        clusteredBinaryInsertionSort(arr9); 
        long endTime9 = System.nanoTime();
		// Measure memory usage after sorting
        long afterUsedMemory9 = runtime.totalMemory() - runtime.freeMemory();
        // Calculate execution time in milliseconds
        long executionTime9 = (endTime9 - startTime9);

		// Output results
		System.out.println("KECIL RANDOM");
        System.out.println("Execution Time: " + executionTime1 / 1000000 + " ms" + " | " + executionTime1 + " ns");
        System.out.println("Memory Before: " + beforeUsedMemory1 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory1 + " bytes");
		System.out.println("Memory Used: " + (afterUsedMemory1 - beforeUsedMemory1) + " bytes");
		// Output results
		System.out.println("\nKECIL SORTED");
        System.out.println("Execution Time: " + executionTime2 / 1000000 + " ms" + " | " + executionTime2 + " ns");
        System.out.println("Memory Before: " + beforeUsedMemory2 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory2 + " bytes");
		System.out.println("Memory Used: " + (afterUsedMemory2 - beforeUsedMemory2) + " bytes");
		// Output results
		System.out.println("\nKECIL REVERSED");
        System.out.println("Execution Time: " + executionTime3 / 1000000 + " ms" + " | " + executionTime3 + " ns");
        System.out.println("Memory Before: " + beforeUsedMemory3 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory3 + " bytes");
		System.out.println("Memory Used: " + (afterUsedMemory3 - beforeUsedMemory3) + " bytes");
		// Output results
		System.out.println("\nSEDANG RANDOM");
        System.out.println("Execution Time: " + executionTime4 / 1000000 + " ms" + " | " + executionTime4 + " ns");
        System.out.println("Memory Before: " + beforeUsedMemory4 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory4 + " bytes");
		System.out.println("Memory Used: " + (afterUsedMemory4 - beforeUsedMemory4) + " bytes");
		// Output results
		System.out.println("\nSEDANG SORTED");
        System.out.println("Execution Time: " + executionTime5 / 1000000 + " ms" + " | " + executionTime5 + " ns");
        System.out.println("Memory Before: " + beforeUsedMemory5 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory5 + " bytes");
		System.out.println("Memory Used: " + (afterUsedMemory5 - beforeUsedMemory5) + " bytes");
		// Output results
		System.out.println("\nSEDANG REVERSED");
        System.out.println("Execution Time: " + executionTime6 / 1000000 + " ms" + " | " + executionTime6 + " ns");
        System.out.println("Memory Before: " + beforeUsedMemory6 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory6 + " bytes");
		System.out.println("Memory Used: " + (afterUsedMemory6 - beforeUsedMemory6) + " bytes");
		// Output results
		System.out.println("\nBESAR RANDOM");
        System.out.println("Execution Time: " + executionTime7 / 1000000 + " ms" + " | " + executionTime7 + " ns");
        System.out.println("Memory Before: " + beforeUsedMemory7 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory7 + " bytes");
		System.out.println("Memory Used: " + (afterUsedMemory7 - beforeUsedMemory7) + " bytes");
		// Output results
		System.out.println("\nBESAR SORTED");
        System.out.println("Execution Time: " + executionTime8 / 1000000 + " ms" + " | " + executionTime8 + " ns");
        System.out.println("Memory Before: " + beforeUsedMemory8 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory8 + " bytes");
		System.out.println("Memory Used: " + (afterUsedMemory8 - beforeUsedMemory8) + " bytes");
		// Output results
		System.out.println("\nBESAR REVERSED");
        System.out.println("Execution Time: " + executionTime9 / 1000000 + " ms" + " | " + executionTime9 + " ns");
        System.out.println("Memory Before: " + beforeUsedMemory9 + " bytes");
        System.out.println("Memory After: " + afterUsedMemory9 + " bytes");
		System.out.println("Memory Used: " + (afterUsedMemory9 - beforeUsedMemory9) + " bytes");
    }

    public static void clusteredBinaryInsertionSort(int[] aList) {
        int POP = 0;

        for (int i = 1; i < aList.length; i++) {
            int COP = i;
            int key = aList[COP];
            int place;

            if (key >= aList[POP]) {
                place = binaryLocFinder(aList, POP + 1, COP - 1, key);
            } else {
                place = binaryLocFinder(aList, 0, POP - 1, key);
            }

            int position = place;
            placeInserter(aList, place, COP);
        }
    }

    public static int binaryLocFinder(int[] aList, int start, int end, int key) {
        if (start == end) {
            if (aList[start] > key) {
                return start;
            } else {
                return start + 1;
            }
        }

        if (start > end) {
            return start;
        } else {
            int middle = (start + end) / 2;

            if (aList[middle] < key) {
                return binaryLocFinder(aList, middle + 1, end, key);
            } else if (aList[middle] > key) {
                return binaryLocFinder(aList, start, middle - 1, key);
            } else {
                return middle;
            }
        }
    }

    public static void placeInserter(int[] aList, int start, int end) {
        int temp = aList[end];
        for (int k = end; k > start; k--) {
            aList[k] = aList[k - 1];
        }
        aList[start] = temp;
    }

    public static void printArray(int[] aList) {
        for (int num : aList) {
            System.out.print(num + " ");
        }
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
