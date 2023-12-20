package bg.tu_varna.sit.a2.f22621663.homework10.task5;


class Person {
    protected String name;

    public Person(String name) {
        if (!isValidName(name)) {
            throw new PersonException();
        }
        this.name = name;
    }

    private boolean isValidName(String name) {
        return name.matches("^[A-Z][a-z]+ [A-Z][a-z]+$");
    }
}
