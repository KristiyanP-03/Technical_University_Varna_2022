package bg.tu_varna.sit.a1.f1234567.test2;

/**
 * Дадена е реализация на алгоритъм за сортиране TimSort.
 * Както знаете той е комбинация от insertion sort и merge sort
 * Анализирайте задачата и определите грешката и коригирайте (без да пренаписвате целия код).
 *
 * Входна последователност:
 * -952 855 -198 0 -73 978 561 800 -204 -269 -709 60 834 -138 58 -423 371 -187 443 -568 332 614 232 -852 165 -196 -762 -136 825 -413 -862 868 -468 -865 -959 677 -230 -619 35 519 -271 264 589 27 -270 -69 -800 -561 761 629 359 -985 225 106 -201 997 230 -182 173 -677 -384 539 -482 379 391 -488 -386 346 -564 -376 130 -30 941 675 -442 26 339 -656 -88 -401 -780 630 642 353 677 151 -932 931 -472 -618 -454 -142 -29 -3 27 389 688 -701 -403 -404
 */

public class Application {
    public static void main(String[] args) {
        Integer[] array = new Integer[args.length];
        for (int i = 0; i < args.length; i++) {
            array[i] = Integer.parseInt(args[i]);
        }

        ArrayWrapper wrapper = new ArrayWrapper(array);

        System.out.println("Given Array is");
        wrapper.printArray();

        TimSort timSort = new TimSort(wrapper);
        timSort.timSort();

        System.out.println("After Sorting Array is");
        wrapper.printArray();
    }
}
