package Throw;
public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException("Ky është një exception i personalizuar");
        } catch (MyException e) {
            System.out.println("Kapur: " + e.getMessage());
        }
    }
}