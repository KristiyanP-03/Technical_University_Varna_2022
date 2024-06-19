package CreationPattern.Singleton;

public class CookingProgram {
    public static void main(String[] args) {
        Chef chef = Chef.getInstance();
        chef.cook();
    }
}