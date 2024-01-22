import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину основания треугольника: ");
        double base = scanner.nextDouble();

        System.out.print("Введите высоту треугольника: ");
        double height = scanner.nextDouble();

        double area = calculateTriangleArea(base, height);

        System.out.println("Площадь треугольника: " + area);
    }

    private static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
