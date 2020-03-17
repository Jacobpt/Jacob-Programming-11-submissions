public class Teacher {
    private String firstName;
    private String lastName;
    private Course subject;
    Teacher(String firstName, String lastName, Course course)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = course;
    }
    public String toString()
    {
        return firstName + " " + lastName + " Subject: " + subject;
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

    public Course getSubject() {
        return subject;
    }

    public void setSubject(Course subject) {
        this.subject = subject;
    }
}
