package example.Generics;

public class Generics {
    public static void main(String[] args) {


        //Generic method to print arrays of any type

    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
