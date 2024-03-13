import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть сторону A прямокутника: ");
        float A = scanner.nextFloat();
        if (A <= 0) {
            System.out.println("Сторона A прямокутника повинна бути додатнім числом.");
            return;
        }

        System.out.print("Введіть сторону B прямокутника: ");
        float B = scanner.nextFloat();
        if (B <= 0) {
            System.out.println("Сторона B прямокутника повинна бути додатнім числом.");
            return;
        }

        System.out.print("Введіть сторону C квадратів: ");
        float C = scanner.nextFloat();
        if (C <= 0) {
            System.out.println("Сторона C квадратів повинна бути додатнім числом.");
            return;
        }

        // Знаходимо кількість квадратів
        int squaresCount = (int) (A / C) * (int) (B / C);

        // Знаходимо площу незайнятої частини
        float areaUnoccupied = A * B - squaresCount * C * C;

        System.out.println("Кількість квадратів на прямокутнику: " + squaresCount);
        System.out.println("Площа незайнятої частини прямокутника: " + areaUnoccupied);

        scanner.close();
    }
}
