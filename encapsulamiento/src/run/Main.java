package run;

import models.Course;
import models.Student;
import models.Teacher;

public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher("Freddy Lopez");
        Course course = new Course("Java Programming",teacher);
    }

}