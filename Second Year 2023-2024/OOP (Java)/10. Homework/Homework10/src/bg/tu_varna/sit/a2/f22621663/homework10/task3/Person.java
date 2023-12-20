package bg.tu_varna.sit.a2.f22621663.homework10.task3;

class Person implements Competency {
    private String egn;
    private String firstName;
    private String lastName;
    private int age;

    public Person(String egn, String firstName, String lastName, int age) throws PersonalDataException {
        if (egn.length() != 10 || firstName == null || lastName == null || firstName.isEmpty() || lastName.isEmpty() || age <= 0) {
            throw new PersonalDataException("Invalid personal data");
        }
        this.egn = egn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getEgn() {
        return egn;
    }

    @Override
    public boolean hasCompetence() {
        return age >= 18 && age <= 75;
    }
}
