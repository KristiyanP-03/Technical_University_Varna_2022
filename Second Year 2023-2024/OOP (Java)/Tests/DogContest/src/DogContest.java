public class DogContest {
    Dog[] arrayOfDogs;

    DogContest(Dog[] arrayOfDogs){
        this.arrayOfDogs = arrayOfDogs;
    }
    public double calculateGrade(Dog dog) {
        return dog.weight / (dog.length + dog.height);
    }

    public boolean equals(Object o){
        Dog d = (Dog) o;
        return this.name == d.name;
    }
}

