

class Box<T>{
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static <E> void printArray(E[] arr){
        for (E item : arr){
            System.out.print(item + " " );
        }

        System.out.println();
    }
}

public class Generics {
    public static void main(String[] arg){
        // Create a Box with Integer type
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Integer value : " + intBox.getValue());

        // Create a BOx with String type
        Box<String> strbox = new Box<>();
        strbox.setValue("Hello");
        System.out.println("String value : " + strbox.getValue());

        // Using the generic method print Integer Array
        Integer[] intArray = {1,2,3,4,5,6};
        System.out.print("Interger array : ");
        Box.printArray(intArray);

        //Using the generic method print String Array
        String[] strArray = {"hello","apple","world"};
        System.out.print("String array :");
        Box.printArray(strArray);

    }
}
