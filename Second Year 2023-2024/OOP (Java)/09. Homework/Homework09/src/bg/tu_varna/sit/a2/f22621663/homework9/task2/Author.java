package bg.tu_varna.sit.a2.f22621663.homework9.task2;

import java.util.Objects;

class Author implements Comparable<Author> {
    private String firstName;
    private String lastName;
    private String country;

    public Author(String firstName, String lastName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int compareTo(Author other) {
        int result = this.firstName.compareTo(other.firstName);
        if (result == 0) {
            result = this.lastName.compareTo(other.lastName);
            if (result == 0) {
                result = this.country.compareTo(other.country);
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName) &&
                Objects.equals(country, author.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, country);
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
