import java.util.Scanner;

public class SphereAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите радиус сферы: ");
        double radius = scanner.nextDouble();

        double area = calculateSphereArea(radius);

        System.out.println("Площадь сферы: " + area);
    }

    private static double calculateSphereArea(double radius) {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}