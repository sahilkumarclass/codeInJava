class Shapes {
    public void area() {
        System.out.println("Displays area: ");
    }
}

class Triangles extends Shapes {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h); // Corrected the formula for the area of a triangle
    }
}
class EquilateralTriangle extends Triangles{
    public void area(int l, int h){
        System.out.println(0.5 * l * h);
    }
}

public class MultilevelInheritance {
    public static void main(String args[]) {
        Triangles s1 = new Triangles();
        s1.area();
        s1.area(12, 30);
        s1.area(30, 40);
    }
}
