package bg.tu_varna.sit.b3.f22621663.homework01.task1;

public class zad1 {
    public static void main(String[] args) {
        int[] threeSidesOfTriangle = {3, -1, 5};


        for (int sideIndex = 0; sideIndex < 3; sideIndex++){
            if (threeSidesOfTriangle[sideIndex] < 0){
                System.out.print("Това число не е валидна страна на триъгълник: '");
                System.out.print(threeSidesOfTriangle[sideIndex]);
                System.out.print("'");
                System.exit(0);
            }
        }
        System.out.println("И трите числа са страни на триъгълник!");


        int a = threeSidesOfTriangle[0];
        int b = threeSidesOfTriangle[1];
        int c = threeSidesOfTriangle[2];

        if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)
                || Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)
                || Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)){
            System.out.println("Трите страни образуват правоъгален триъгълник!");
        }


    }
}
