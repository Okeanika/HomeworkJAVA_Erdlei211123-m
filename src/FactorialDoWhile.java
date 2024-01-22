public class FactorialDoWhile {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int result = 1;
        int i = 1;
        do {
            result *= i;
            i++;
        } while (i <= number);
        System.out.println("Факториал: " + result);
    }
}