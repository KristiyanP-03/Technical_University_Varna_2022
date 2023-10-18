public class Dog {
    String name;
    String breed;
    int weight;
    double length;
    double height;

    Dog(String name, String breed, int weight, double length, double height){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.length = length;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getWeight() {
        return weight;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }
}
