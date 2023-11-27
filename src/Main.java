public class Main {
    public static void main(String[] args) {
        System.out.println(divisionZero(4));

    }

    public static int divisionZero(int num) {
        int result = 0;

        try {
            result = num / 0;

        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e);
        }

        return result;
    }
}
