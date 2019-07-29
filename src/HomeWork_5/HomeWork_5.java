package HomeWork_5;

public class HomeWork_5 {
    public static void main(String[] args) {
        System.out.println(recExponent(98, 5));
    }

    public static long recExponent(int number, int value) {
        if (value == 1) {
            return number;
        }
        return recExponent(number, value - 1) * number;
    }
}
