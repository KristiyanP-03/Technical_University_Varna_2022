package bg.tu_varna.sit.a2.f2231663.test;

import java.util.Objects;

abstract class Animal implements FoodCalculator, SpaceCalculator, Comparable<Animal> {
    private String animalId;
    private String name;
    private int yearOfSheltering;
    private Caretaker caretaker;

    public Animal(String animalId, String name, int yearOfSheltering, Caretaker caretaker) {
        this.animalId = animalId;
        this.name = name;
        this.yearOfSheltering = yearOfSheltering;
        this.caretaker = caretaker;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Animal animal = (Animal) obj;
        return Objects.equals(animalId, animal.animalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalId);
    }

    @Override
    public int compareTo(Animal otherAnimal) {
        return Integer.compare(this.yearOfSheltering, otherAnimal.yearOfSheltering);
    }

    @Override
    public String toString() {
        return animalId + " " + getClass().getSimpleName() + " " + name;
    }
}
