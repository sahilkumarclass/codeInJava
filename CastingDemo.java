import java.security.SecureRandom;

class Person{
    String name;
}

class Teacher extends Person{
    void teach(){
        System.out.println("In Teacher class");
    }
}

class Student extends Person{
    void learn(){
        System.out.println("In Student class");
    }
}
public class CastingDemo {
    public static void main(String[] args) {
        Person p;
        Student s = new Student();
        Teacher t = new Teacher();
        
        p = s;
//        p = t;
        
        if (p instanceof Teacher)
            t = (Teacher) p;
    }
}
