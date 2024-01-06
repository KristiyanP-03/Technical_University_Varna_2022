package bg.tu_varna.sit.a2.f2231663.test;

import java.util.HashSet;
import java.util.Set;

/*
class Register {
    private Set<Animal> animals;

    public Register() {
        this.animals = new HashSet<>();
    }

    public void addAnimal(Animal animal) throws AnimalException {
        if (animals.contains(animal)) {
            throw new AnimalException("Има вече" + animal);
        }
        animals.add(animal);
    }

    public String getAllAnimals() {
        StringBuilder result = new StringBuilder();
        for (Animal animal : animals) {
            result.append(animal).append("\n");
        }
        return result.toString();
    }

    public void adoptAnimal(String animalId) throws AnimalException {
        Animal animalToRemove = null;
        for (Animal animal : animals) {
            if (animal.getAnimalId().equals(animalId)) {
                animalToRemove = animal;
                break;
            }
        }
        if (animalToRemove == null) {
            throw new AnimalException("Няма " + animalId);
        }
        animals.remove(animalToRemove);
    }

    public void sortByYearOfSheltering() {
        List<Animal> sortedList = new ArrayList<>(animals);
        Collections.sort(sortedList);
        animals = new LinkedHashSet<>(sortedList);
    }

    public void sortByAnimalName() {
        List<Animal> sortedList = new ArrayList<>(animals);
        sortedList.sort(Comparator.comparing(Animal::getName));
        animals = new LinkedHashSet<>(sortedList);
    }

    public Caretaker findCaretaker(String firstName, String lastName) throws AnimalException {
        for (Animal animal : animals) {
            if (animal.getCaretaker().equals(new Caretaker(firstName, lastName, ""))) {
                return animal.getCaretaker();
            }
        }
        throw new AnimalException("Няма " + firstName + " " + lastName);
    }
}
*/