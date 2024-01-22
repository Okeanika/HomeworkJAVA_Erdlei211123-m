import java.util.Scanner;

public class TrapezoidPerimeterCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первого основания трапеции: ");
        double base1 = scanner.nextDouble();

        System.out.print("Введите длину второго основания трапеции: ");
        double base2 = scanner.nextDouble();

        System.out.print("Введите длину боковой стороны трапеции: ");
        double side = scanner.nextDouble();

        double perimeter = calculateTrapezoidPerimeter(base1, base2, side);

        System.out.println("Периметр трапеции: " + perimeter);
    }

    private static double calculateTrapezoidPerimeter(double base1, double base2, double side) {
        return base1 + base2 + 2 * side;
    }
}