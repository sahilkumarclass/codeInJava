class Shape{
    String color;
}
class Triangle extends Shape{

}
public class Inheritance {
    public static void main(String args[]){
        Triangle s2 = new Triangle();
        s2.color = "RED";
        System.out.print(s2.color);
    }
}
