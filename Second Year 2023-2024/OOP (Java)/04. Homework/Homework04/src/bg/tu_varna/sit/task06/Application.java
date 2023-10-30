package bg.tu_varna.sit.task06;

/**
 * Анализирайте задачата и определите грешката (без да пренаписвате целия код),
 *  така че да променят стойностите на първоначални масив според операциите:
 *
 *  <операция> <index> <value>
 *
 *      където <операция> е действието което трябва да се изпълни
 *      <index> върху кой елемент на масива трябва да се изпълни действието и <value> втория операнд в операцията
 *
 *      Очакван резултат:
 *      2 0 11  999 11
 */

public class Application {
    public static void main(String[] args) {

        long[] array = {3, 0, 9, 333, 11};

        String[] commands = {
                "add 2 2",
                "subtract 0 1",
                "multiply 3 3",
                "stop",
        };

        for (String command : commands) {
            if (command.equals("stop")) {
                break;
            }
            int[] params = new int[2];
            String[] stringParams = command.split(" ");
            String operation = stringParams[0];
            params[0] = Integer.parseInt(stringParams[1]);
            params[1] = Integer.parseInt(stringParams[2]);

            array = Calculator.performAction(array, operation, params);
        }

        ArrayWrapper.printArray(array);
    }
}