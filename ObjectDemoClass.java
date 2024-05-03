//import java.util.Objects;
//
//class Student{
//    String name;
//    String rollNo;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return Objects.equals(name, student.name) && Objects.equals(rollNo, student.rollNo);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setRollNo(String rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, rollNo);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", rollNo='" + rollNo + '\'' +
//                '}';
//    }
//}
//public class ObjectDemoClass {
//    public static void main(String[] args) {
//        Student obj = new Student();
//        obj.name = "XYZ";
//        obj.rollNo = "1";
//
//        Student obj1 = new Student();
//        obj1.name = "XYZ";
//        obj1.rollNo = "1";
//        System.out.println(obj.equals(obj1));
//        System.out.println(obj.toString());
//    }
//}
