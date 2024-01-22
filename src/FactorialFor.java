public class FactorialFor {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        System.out.println("Факториал: " + result);
    }
}