
public class TestStudents
{

        public static void main(String[] args)
        {
            Student a = new Student("Egon");
            Student b = new Student("Børge");
            Student c = new Student("Yvonne");

            Course basic = new Course("Basic Programming");
            Course algorithm = new Course("Algorithms");
            Course web = new Course("Web Programming");
            Course databases = new Course("Databases");

            a.addCourse(basic);
            a.addCourse(algorithm);

            b.addCourse(basic);
            b.addCourse(web);
            b.addCourse(algorithm);

            c.addCourse(basic);
            c.addCourse(databases);

            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }


}
