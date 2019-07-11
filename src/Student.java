public class Student {
    private String firstName;
    private String lastName;
    private int grade;
    private int id;
    private static int studentCount = 0;

    Student(String firstName, String lastName, int grade)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
        this.id = studentCount;
        studentCount++;
    }

    public String toString()
    {
        return firstName + " " + lastName + " Grade: " + grade + ". id: " + id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
