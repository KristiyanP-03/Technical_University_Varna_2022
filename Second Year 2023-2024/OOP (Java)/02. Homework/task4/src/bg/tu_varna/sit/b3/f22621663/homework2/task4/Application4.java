package bg.tu_varna.sit.b3.f22621663.homework2.task4;

public class Application4 {
    public static void main(String[] args) {
        StudentGroup[] groups = new StudentGroup[3];
        groups[0] = new StudentGroup("SIT", 1, "2", 29);
        groups[1] = new StudentGroup("KST", 2, "4", 26);
        groups[2] = new StudentGroup("KS", 4, "5", 15);

        Faculty faculty = new Faculty(groups);

        int courseToSearch = 4;
        StudentGroup groupWithMaxStudents = faculty.getGroupWithMaxStudentsByCourse(courseToSearch);

        if (groupWithMaxStudents != null) {
            System.out.println("Group with the most students in Course " + courseToSearch + ":");
            System.out.println(groupWithMaxStudents.getDescription());
        } else {
            System.out.println("No groups found for Course " + courseToSearch);
        }
    }}
