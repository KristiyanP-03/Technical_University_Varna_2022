package testprep.Interfaces;

interface ExampleInterface {
    /* Всички методи са публични и абстрактни по добразбиране
     * те нямат тяло
     */
    public void method1();
    public void method2();
}
class Demo implements ExampleInterface {
    /* Класовете, който имплементират интерфейса
     * трябва да реализират методите на интерфейса
     */
    public void method1()
    {
        System.out.println("implementation of method1");
    }
    public void method2()
    {
        System.out.println("implementation of method2");
    }
}
class App {
    public static void main(String arg[])
    {
        ExampleInterface obj = new Demo();
        obj.method2();
    }
}