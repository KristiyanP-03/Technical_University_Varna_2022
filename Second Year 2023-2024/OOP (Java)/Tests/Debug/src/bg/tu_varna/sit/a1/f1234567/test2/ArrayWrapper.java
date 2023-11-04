package bg.tu_varna.sit.a1.f1234567.test2;

public class ArrayWrapper {
    public Integer[] array;

    public ArrayWrapper(Integer[] array) {
        this.array = array;
    }

    public void printArray() {
        for (int i = 0; i < this.array.length; i++) {
            System.out.print(this.array[i] + " ");
        }
        System.out.print("\n");
    }

    public Integer getLength() {
        return this.array.length;
    }

    public Integer[] getSubArray(int startIndex, int length) {
        Integer[] left = new Integer[length];
        for (int x = 0; x < length; x++)
        {
            left[x] = this.array[startIndex + x];
        }
        return left;
    }

    public ArrayIndicesResult replace(Integer[] leftArray, Integer[] rightArray, int startLeftIndex) {
        int currentItem = startLeftIndex, leftItemIndex = 0, rightItemIndex = 0;

        while (leftItemIndex < leftArray.length && rightItemIndex < rightArray.length)
        {
            if (leftArray[leftItemIndex] <= rightArray[rightItemIndex])
            {
                this.array[currentItem] = leftArray[leftItemIndex];
                leftItemIndex++;
            }
            else {
                this.array[currentItem] = rightArray[rightItemIndex];
                rightItemIndex++;
            }
            currentItem++;
        }

        return new ArrayIndicesResult(startLeftIndex, leftItemIndex, rightItemIndex);
    }

    public void copy(int startIndex, Integer[] leftArray, int from, int length) {
        while (from < length) {
            leftArray[from] = this.array[startIndex];
            startIndex++;
            from++;
        }
    }

    public int get(int position) {
        return this.array[position];
    }

    public void set(int position, int temp) {
        this.array[position] = temp;
    }
}
