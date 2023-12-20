package bg.tu_varna.sit.a2.f22621663.homework10.task5;

// Клас за преподавател
class Teacher extends Person {
    private AcademicPosition academicPosition;

    public Teacher(String name, AcademicPosition academicPosition) {
        super(name);
        this.academicPosition = academicPosition;
    }

    public AcademicPosition getAcademicPosition() {
        return academicPosition;
    }
}
