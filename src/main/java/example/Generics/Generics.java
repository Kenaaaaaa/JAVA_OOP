package example.Generics;

public class Generics {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        for (int i = 0; i < integers.length; i++) {
            integers[i] = i * 10;
        }
        printArray(integers); // Print Integer array
        String[] strings = new String[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "String " + i;
        }
        printArray(strings); // Print String array
        Double[] doubles = new Double[10];
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = i * 1.5;
        }
        printArray(doubles); // Print Double array

        //Generic method to print arrays of any type

    }
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
