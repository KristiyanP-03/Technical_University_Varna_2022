package bg.tu_varna.sit.a2.f22621663.homework6.task1;

public class Author {
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

    public String authorComparison(Author author1, Author author2){
        if (author1.firstName.equals(author2.firstName) &&
                author1.lastName.equals(author2.lastName) &&
                author1.country.equals(author2.country))
        {
            return String.format("%s, %s", author1.lastName, author1.firstName);
        }

        return "Not the same author";
    }
}
