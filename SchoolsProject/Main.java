import java.util.ArrayList;
public class Main {
    public static void main(String[] args)
    {
        /*

            creating a school:
            new School(String name of the school, int lowest grade taught, int highest grade taught);
            creating a student:
            new Student(String firstName, String lastName, int grade);
            creating a teacher
            new Teacher(String firstName, String lastName, Course subject); remember to use a course object, not a string.
            a list of all available functions for type school
            addStudent(Student student); adds a student to the school
            removeStudentById(int id); removes a student with the ID number. Each student gets a unique Id number upon creation
            removeStudentByName(String name); removes a student by LAST name
            printStudents(); prints a list of the students
            //
        */

        Student aaron = new Student("Aaron", "Micheals", 9);
        Student gordon = new Student("Gordon", "Freeman",11);
        Student franklin = new Student("Franklin", "Wesley", 10);
        Student mikhail = new Student("Mikhail", "Petrov", 12);
        Student nguyen = new Student("Nguyen", "Chu", 8);
        Student bobby = new Student("Bobby", "Fletcher", 10);
        Student harley = new Student("Harley", "Roosevelt", 9);
        Student august = new Student("August", "Wilhelm", 11);
        Student henry = new Student("Henry", "Bishop", 12);
        Student richard = new Student("Richard", "Sanchez", 11);

        Course science = new Course("Science");
        Course math = new Course("Math");
        Course english = new Course("English");

        Teacher fung = new Teacher("Eric", "Fung", math);
        Teacher donald = new Teacher("Joseph", "Donald", science);
        Teacher smith = new Teacher("Eva", "Smith", english);

        School hamber = new School("Eric Hamber", 8, 12);
        hamber.addStudent(aaron);
        hamber.addStudent(gordon);
        hamber.addStudent(franklin);
        hamber.addStudent(mikhail);
        hamber.addStudent(nguyen);
        hamber.addStudent(bobby);
        hamber.addStudent(harley);
        hamber.addStudent(august);
        hamber.addStudent(henry);
        hamber.addStudent(richard);

        hamber.addTeacher(fung);
        hamber.addTeacher(smith);
        hamber.addTeacher(donald);

        hamber.printStudents();
        hamber.printTeachers();

        hamber.removeStudentById(5); //removes Bobby Fletcher in this case
        hamber.removeStudentByName("Bishop");
        hamber.removeTeacher("Fung");

        hamber.printStudents();
        hamber.printTeachers();




    }

}
