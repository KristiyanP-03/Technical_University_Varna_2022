package bg.tu_varna.sit.a2.f22621663.homework10.task4;

class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public int compareTo(Person o) {
        int result = this.firstName.compareTo(o.firstName);
        if (result == 0) {
            result = this.lastName.compareTo(o.lastName);
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("%s %s", firstName, lastName);
    }
}
