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

        int[] aList = {5, 2, 9, 1, 5, 6}; // Contoh data angka yang akan diurutkan

        System.out.println("Data sebelum diurutkan:");
        printArray(aList);

        clusteredBinaryInsertionSort(aList);

        System.out.println("Data setelah diurutkan:");
        printArray(aList);
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
