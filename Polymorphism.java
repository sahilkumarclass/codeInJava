class Students{
    String name;
    int age;
    Students(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.print(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
}
public class Polymorphism {
    public static void main(String args[]){
        Students s1 = new Students("Sahil", 20);
        s1.printInfo(s1.name, s1.age);
    }
}
