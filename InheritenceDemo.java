class Animal{
    String name;
     void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

class Labrador extends Dog{
    void fetch(){
        System.out.println("Labrador is fetching");
    }
}

class Cat extends  Animal{
    void scratch(){
        System.out.println("Cat is scratchhing");
    }

}
public class InheritenceDemo {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.name = "XYZ";
        a.eat();

        Dog pupppy = new Dog();
        System.out.println(pupppy.name);
        pupppy.eat();
        pupppy.bark();

        Labrador puppy1 = new Labrador();
        puppy1.eat();
        puppy1.bark();
        puppy1.fetch();

        Cat c = new Cat();
        System.out.println(c.name);
        c.eat();
        c.scratch();



    }
}
