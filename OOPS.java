class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something");
    }

    public void print() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    // Parameterized constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS {
    public static void main(String args[]) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";
        pen1.write();
        Pen pen2 = new Pen();
        pen2.color = "Red";
        pen2.type = "Ballpoint";
        pen1.print();
        pen2.print();

        Student s2 = new Student("Ankit", 18); // With parameter;
        Student s3 = new Student(s2);
        s2.printInfo();
        s3.printInfo();
    }
}
