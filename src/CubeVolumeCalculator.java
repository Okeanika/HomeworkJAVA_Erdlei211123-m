import java.util.Scanner;

public class CubeVolumeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину ребра куба: ");
        double sideLength = scanner.nextDouble();

        double volume = calculateCubeVolume(sideLength);

        System.out.println("Объем куба: " + volume);
    }

    private static double calculateCubeVolume(double sideLength) {
        return Math.pow(sideLength, 3);
    }
}

