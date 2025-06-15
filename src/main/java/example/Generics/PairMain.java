package example.Generics;

public class PairMain {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<>("One", 1);
        System.out.println(pair);

        pair.setKey("Two");
        pair.setValue(2);
        System.out.println(pair);

        Pair<Integer, String> anotherPair = new Pair<>(1, "One");
        System.out.println(anotherPair);

        anotherPair.setKey(2);
        anotherPair.setValue("Two");
        System.out.println(anotherPair);
    }
}
