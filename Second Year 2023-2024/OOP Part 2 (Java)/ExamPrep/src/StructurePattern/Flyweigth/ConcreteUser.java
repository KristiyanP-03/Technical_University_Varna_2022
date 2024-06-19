package StructurePattern.Flyweigth;

// Конкретен клас за потребител
class ConcreteUser implements User {
    private final String username;
    private final String email;

    public ConcreteUser(String username, String email) {
        this.username = username;
        this.email = email;
    }

    @Override
    public void display() {
        System.out.println("Username: " + username + ", Email: " + email);
    }
}
