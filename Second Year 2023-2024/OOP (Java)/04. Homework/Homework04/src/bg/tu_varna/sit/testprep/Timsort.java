package bg.tu_varna.sit.testprep;

import java.util.Arrays;
public class Timsort {
    private static final int MIN_MERGE = 32;
    private int[] arr;

    public Timsort(int[] arr) {
        this.arr = arr;
    }

    public void sort() {
        int len = arr.length;
        if (len < 2) {
            return;
        }

        int minRun = minRunLength(len);

        for (int i = 0; i < len; i += minRun) {
            int end = Math.min((i + minRun - 1), (len - 1));
            insertionSort(i, end);
        }

        for (int size = minRun; size < len; size = 2 * size) {
            for (int left = 0; left < len; left += 2 * size) {
                int mid = Math.min((left + size - 1), (len - 1));
                int right = Math.min((left + 2 * size - 1), (len - 1));
                if (mid < right) {
                    merge(left, mid, right);
                }
            }
        }
    }

    private int minRunLength(int n) {
        int r = 0;
        while (n >= MIN_MERGE) {
            r |= (n & 1);
            n >>= 1;
        }
        return n + r;
    }

    private void insertionSort(int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= left && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    private void merge(int startLeftIndex, int midIndex, int endRightIndex) {
        int leftArrayLength = midIndex - startLeftIndex + 1;
        int rightArrayLength = endRightIndex - midIndex;

        int[] leftArray = new int[leftArrayLength];
        int[] rightArray = new int[rightArrayLength];

        for (int i = 0; i < leftArrayLength; i++) {
            leftArray[i] = arr[startLeftIndex + i];
        }

        for (int i = 0; i < rightArrayLength; i++) {
            rightArray[i] = arr[midIndex + 1 + i];
        }

        int i = 0, j = 0, k = startLeftIndex;

        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArrayLength) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArrayLength) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        Timsort timsort = new Timsort(arr);
        timsort.sort();
        System.out.println(Arrays.toString(arr));
    }
}