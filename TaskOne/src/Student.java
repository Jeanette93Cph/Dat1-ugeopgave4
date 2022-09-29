import java.util.ArrayList;

public class Student
{

    private String name;
    private ArrayList<Course> courses = new ArrayList<>(10);


    //constructor
    Student(String name)
    {
        this.name = name;
    }

    void addCourse(Course course)
    {
        //added object course til array
        courses.add(course);
    }


    public String toString()
    {
        return " Name: " + name  + "," + " courses: " + courses;
    }




}
