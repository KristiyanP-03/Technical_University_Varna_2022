class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private String course;
    private String group;
    private String facultyNumber;
    private String educationForm;
    private String language;
    private String OKS;

    public Student(String firstName, String middleName, String lastName, String course, String group,
                   String facultyNumber, String educationForm, String language, String OKS) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.course = course;
        this.group = group;
        this.facultyNumber = facultyNumber;
        this.educationForm = educationForm;
        this.language = language;
        this.OKS = OKS;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + middleName + " " + lastName + "\n" +
                "Course: " + course + "\n" +
                "Group: " + group + "\n" +
                "Faculty Number: " + facultyNumber + "\n" +
                "Education Form: " + educationForm + "\n" +
                "Language: " + language + "\n" +
                "OKS: " + OKS + "\n";
    }
}
