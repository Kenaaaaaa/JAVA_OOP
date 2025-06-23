package Try_Catch;

public class DivideWith0 {
    public static void main(String[] args) {
        try{
            int a = 1 / 0;
        }catch (ArithmeticException e){
            System.out.println("Gabim ndarja me zero");
        }
    }
}
