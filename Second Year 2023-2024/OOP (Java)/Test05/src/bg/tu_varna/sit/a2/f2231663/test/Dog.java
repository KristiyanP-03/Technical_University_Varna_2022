package bg.tu_varna.sit.a2.f2231663.test;


class Dog extends Animal {
    private double weight;
    private Character character;

    public Dog(String animalId, String name, int yearOfSheltering, Caretaker caretaker, double weight, Character character) {
        super(animalId, name, yearOfSheltering, caretaker);
        this.weight = weight;
        this.character = character;
    }

    @Override
    public double calculateFood() {
        return weight * 0.02;
    }

    @Override
    public double calculateSpace() {
        return (character == Character.CALM) ? 10 : 10 + weight * 0.5;
    }

    @Override
    public String toString() {
        return super.toString() + " Weight: " + weight + " Character: " + character;
    }
}
