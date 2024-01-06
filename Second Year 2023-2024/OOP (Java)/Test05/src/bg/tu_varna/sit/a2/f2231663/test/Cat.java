package bg.tu_varna.sit.a2.f2231663.test;

class Cat extends Animal {
    private Color color;
    private double furLength;

    public Cat(String animalId, String name, int yearOfSheltering, Caretaker caretaker, Color color, double furLength) {
        super(animalId, name, yearOfSheltering, caretaker);
        this.color = color;
        this.furLength = furLength;
    }

    @Override
    public double calculateFood() {
        return 0.3;
    }

    @Override
    public double calculateSpace() {
        return (furLength < 2) ? 3 : 4.5;
    }

    @Override
    public String toString() {
        return super.toString() + " Color: " + color + " Fur Length: " + furLength;
    }
}
