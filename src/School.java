import java.lang.reflect.Array;
import java.util.ArrayList;

public class School { //this class is meant to represent a school
    private String name;
    private ArrayList <Student> students = new ArrayList<>(); //list of students
    private ArrayList <Teacher> teachers = new ArrayList<>(); //teachers
   // private ArrayList <Course> classes = new ArrayList<>(); //list of courses
    private int bottomgrade; //lowest and highest grades taught. A high school might be bottomgrade = 8, topgrade = 12 for example
    private int topgrade;

    School(String name, int bottomgrade, int topgrade)
    {
        this.name = name;
        this.bottomgrade = bottomgrade;
        this.topgrade = topgrade;
    }

    public void addTeacher(Teacher teacher)
    {

        {
            teachers.add(teacher);
        }
    }

    public void addStudent(Student student)
    {
        if(student.getGrade() < this.bottomgrade || student.getGrade() > this.topgrade)
        {
            System.out.println("Your students grade is out of range for this school. Schools range: " + this.bottomgrade +"-" + this.topgrade);
        }
        else
        {
            students.add(student);
        }
    }

    public void printStudents()
    {
        System.out.println("Printing list of Students in " + name);
        for(int i = 0; i < students.size(); i++)
        {
            System.out.println(students.get(i));
        }
        System.out.println();
    }
    public void printTeachers()
    {
        System.out.println("Printing list of Teachers in " + name);
        for(int i = 0; i < teachers.size(); i++)
        {
            System.out.println(teachers.get(i));
        }
        System.out.println();
    }

    public void removeStudentById(int id)
    {
        int detected = 0;
        for(int i = 0; i < this.students.size(); i++)
        {
            if(id == this.students.get(i).getId())
            {
                this.students.remove(i);
                detected = 1;
            }
        }
        if(detected == 0)
        {
            System.out.println("could not find a student with the requested id");
        }
    }
    public void removeStudentByName(String name)  //note that this function will delete ALL students with this last name
    {
        int detected = 0;
        for(int i = 0; i < this.students.size(); i++)
        {
            if(name.equals(this.students.get(i).getLastName()))
            {
                this.students.remove(i);
                detected = 1;
            }
        }
        if(detected == 0)
        {
            System.out.println("could not find a student with the requested last name");
        }
    }

    public void removeTeacher(String name)
    {
        int detected = 0;
        for(int i = 0; i < this.teachers.size(); i++)
        {
            if(name.equals(this.teachers.get(i).getLastName()))
            {
                this.teachers.remove(i);
                detected = 1;
            }
        }
        if(detected == 0)
        {
            System.out.println("could not find a teacher with the requested last name");
        }

    }

    public String toString() //NOTE THAT PRINTING A SCHOOL WILL NOT PRINT OUT A LIST STUDENTS OR TEACHERS, ONLY THE AMOUNT OF EACH.
    {
        return name + ", for grades " + bottomgrade + "-" + topgrade + ". Student count: " + students.size() + ". Teacher count: " + teachers.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBottomgrade() {
        return bottomgrade;
    }

    public void setBottomgrade(int bottomgrade) {
        this.bottomgrade = bottomgrade;
    }

    public int getTopgrade() {
        return topgrade;
    }

    public void setTopgrade(int topgrade) {
        this.topgrade = topgrade;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Course> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Course> classes) {
        this.classes = classes;
    }
}
