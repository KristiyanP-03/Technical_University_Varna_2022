package bg.tu_varna.sit.b3.f22621663.homework2.task4;

public class Faculty {
    StudentGroup[] studentGroups;

    Faculty(StudentGroup[] studentGroups) {
        this.studentGroups = studentGroups;
    }

    StudentGroup getGroupWithMaxStudentsByCourse(int course) {
        StudentGroup maxStudentGroup = null;
        int maxStudents = -1;

        for (StudentGroup group : studentGroups) {
            if (group.getCourse() == course && group.getNumberOfStudents() > maxStudents) {
                maxStudents = group.getNumberOfStudents();
                maxStudentGroup = group;
            }
        }

        return maxStudentGroup;
    }
}
