package OOP.Generic;

class Test {
    // A Generic method example
    static <T> void genericDisplay(T element)
    {
        System.out.println(element.getClass().getName() + " = " + element);
    }


    // Driver method
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        Test.genericDisplay(11);

        // Calling generic method with String argument
        Test.genericDisplay("TU-Varna");

        // Calling generic method with double argument
        Test.genericDisplay(1.0);
    }
}
