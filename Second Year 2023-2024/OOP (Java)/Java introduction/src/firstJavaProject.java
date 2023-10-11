public class firstJavaProject {
    public static void main(String[] args) {   // <---  psvm + tap
        //ЗАДАЧА 1
         /*
         for(int number = 1; number <= 299; number += 2){
             System.out.println(number);
         }
         */

        int[] vhs = {5, 6, 7, 9};
        double[] pricesArray = {2.5, 3.6, 8.9, 7.5};

        double[] totalPrices = new double[4];

        for(int index = 0; index < vhs.length; index++){
            totalPrices[index] = vhs[index] * pricesArray[index];

        }
        System.out.println(Arrays.toString(totalPrices));

    }
}
