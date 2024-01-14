package OOP.Inheritance;

import java.util.Objects;

public class Cat extends Animal{
    String fur;

    public Cat(String name, int age, double weight, String fur) {
        super(name, age, weight);
        this.fur = fur;
    }



    public String getName() {
        return name;
    }
    public void setName(String name) {
        name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Double.compare(weight, cat.weight) == 0 && Objects.equals(name, cat.name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "fur='" + fur + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public void catReaction(){
        System.out.println("Meow?");
    }





    public static void main(String[] args) {
        Cat myPet = new Cat("Mara", 1, 3.54, "white");
        Cat yourCat = new Cat("Matty", 2, 4.31, "gray");

        myPet.catReaction();
        System.out.println(myPet.toString());

        System.out.println(myPet == yourCat); //проверява адреса
        System.out.println(myPet.equals(yourCat)); //проверява стойността
    }
}


