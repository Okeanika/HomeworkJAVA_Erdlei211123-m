public class FactorialWhile {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int result = 1;
        int i = 1;
        while (i <= number) {
            result *= i;
            i++;
        }
        System.out.println("Факториал: " + result);
    }
}