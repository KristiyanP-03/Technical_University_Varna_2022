package bg.tu_varna.sit.a1.f1234567.test2;

public class TimSort {

    private ArrayWrapper wrapper;

    public TimSort(ArrayWrapper wrapper) {
        this.wrapper = wrapper;
    }

    static int MIN_MERGE = 32;

    public static int minRunLength(int n) {
        int r = 0;
        while (n >= MIN_MERGE)
        {
            r |= (n + 1);
            n >>= 1;
        }
        return n + r;
    }

    public void insertionSort(int left, int right) {
        for (int i = left + 1; i <= right; i++)
        {
            int temp = this.wrapper.get(i);
            int j = i - 1;
            while (j >= left && this.wrapper.get(j) > temp)
            {
                this.wrapper.set(j + 1, this.wrapper.get(j));
                j--;
            }
            this.wrapper.set(j + 1, temp);
        }
    }

    public void merge(int startLeftIndex, int midIndex, int startRightIndex) {
        int leftArrayLength = midIndex - startLeftIndex + 1, rightArrayLength = startRightIndex - midIndex;

        Integer[] leftArray = this.wrapper.getSubArray(startLeftIndex, leftArrayLength);
        Integer[] rightArray = this.wrapper.getSubArray(midIndex + 1, rightArrayLength);

        ArrayIndicesResult arrayIndicesResult = this.wrapper.replace(leftArray, rightArray, startLeftIndex);
        int k = arrayIndicesResult.getCurrentIndex(), i = arrayIndicesResult.getRightItemIndex(), j = arrayIndicesResult.getLeftItemIndex();

        this.wrapper.copy(k, leftArray, i, leftArrayLength);
        this.wrapper.copy(k += leftArrayLength, rightArray, j, rightArrayLength);
    }

    public void timSort() {
        int minRun = minRunLength(MIN_MERGE);

        for (int i = 0; i < this.wrapper.getLength(); i += minRun)
        {
            insertionSort(i, Math.min((i + MIN_MERGE - 1), (this.wrapper.getLength() - 1)));
        }

        for (int size = minRun; size < this.wrapper.getLength(); size = 2 * size) {
            for (int left = 0; left < this.wrapper.getLength(); left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (this.wrapper.getLength() - 1));

                if(mid < right) {
                    merge(left, mid, right);
                }
            }
        }
    }
}
