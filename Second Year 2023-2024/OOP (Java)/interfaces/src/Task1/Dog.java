package Task1;

public class Dog extends Animal implements Pet{
    @Override
    String sound() {
        return "bark";
    }
}
