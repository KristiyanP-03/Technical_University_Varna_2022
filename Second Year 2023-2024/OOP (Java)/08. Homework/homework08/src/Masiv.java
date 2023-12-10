public class Masiv {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int number : numbers) {
            int count = 0;
            for (int i = 2; i <= number; i++) {
                while (number % i == 0) {
                    count++;
                    number /= i;
                }
            }
            System.out.println(number + " /  " + count);
        }
    }
}



