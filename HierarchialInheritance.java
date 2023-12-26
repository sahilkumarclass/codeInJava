class Shape1 {
    public void area() {
        System.out.println("Displays area: ");
    }
}
class Triangle1 extends Shapes {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h); // Corrected the formula for the area of a triangle
    }
}
class Circle extends Shape1{
    public void area(int r){
        System.out.print((3.14) * r * r);
    }
}
public class HierarchialInheritance {
    public static void main(String args[]){
        Triangle1 s1 = new Triangle1();
        Circle s2 = new Circle();
        s1.area();
        s2.area();
        s1.area(23, 45);
        s2.area(2);
    }
}
