package bg.tu_varna.sit.a2.f2231663.test;

import java.util.Objects;

class Caretaker {
    private String firstName;
    private String lastName;
    private String position;

    public Caretaker(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Caretaker caretaker = (Caretaker) obj;
        return Objects.equals(firstName, caretaker.firstName) &&
                Objects.equals(lastName, caretaker.lastName) &&
                Objects.equals(position, caretaker.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position);
    }

    @Override
    public String toString() {
        return "Caretaker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
