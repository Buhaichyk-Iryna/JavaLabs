import java.util.Random;
import java.util.Scanner;

public class Main{
    private static final int MAX = 20;
    private static final int MIN = -20;
    private int[][] matrix;
    private int width;
    private int height;

    public static void main(String[] args) {
        Main matrixOperations = new Main();
        matrixOperations.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in); // сканер для отримання даних, введених користувачем
        //меню  вибору
        System.out.println("Виберіть спосіб створення матриці:");
        System.out.println("1. Ввести з клавіатури");
        System.out.println("2. Згенерувати випадково");
        int choice = scanner.nextInt();

        //оператор вибору пункта меню
        switch (choice) {
            case 1:
                createMatrixFromInput(scanner);
                break;
            case 2:
                createRandomMatrix(scanner);
                break;
            default:
                System.out.println("Неправильний вибір. Спробуйте ще раз.");
                run();
        }

        if (matrix != null) {
            System.out.println("Матриця:");
            printMatrix();

            int min = findMin();
            int max = findMax();
            double average = findAverage();
            double geometricMean = findGeometric();
            //вивід розрахунків
            System.out.println("Мінімальний елемент: " + min);
            System.out.println("Максимальний елемент: " + max);
            System.out.println("Середнє арифметичне: " + average);
            System.out.println("Середнє геометричне: " + geometricMean);
        }
    }

    //функція створення матриці введення з клавіатури
    private void createMatrixFromInput(Scanner scanner) {
        System.out.print("Введіть ширину матриці: ");
        width = scanner.nextInt();
        System.out.print("Введіть висоту матриці: ");
        height = scanner.nextInt();

        if (width > 20 || height > 20) {
            System.out.println("Розмір матриці не може перевищувати 20x20. Спробуйте ще раз.");
            createMatrixFromInput(scanner);
            return;
        }

        matrix = new int[height][width];

        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("Елемент [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    //функція створення рандомної матриці
    private void createRandomMatrix(Scanner scanner) {
        System.out.print("Введіть ширину матриці: ");
        width = scanner.nextInt();
        System.out.print("Введіть висоту матриці: ");
        height = scanner.nextInt();

        if (width > 20 || height > 20) {
            System.out.println("Розмір матриці не може перевищувати 20x20. Спробуйте ще раз.");
            createRandomMatrix(scanner);
            return;
        }

        matrix = new int[height][width];
        Random random = new Random();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                matrix[i][j] = random.nextInt(MAX - MIN + 1) + MIN;
            }
        }
    }

    //функція виведення створеної матриці
    private void printMatrix() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //функція знаходження мінімуму
    private int findMin() {
        int min = matrix[0][0];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }

        return min;
    }

    //функція знаходження максимуму
    private int findMax() {
        int max = matrix[0][0];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        return max;
    }
    //функція знаходження середнього арифметичного
    private double findAverage() {
        int sum = 0;
        int count = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sum += matrix[i][j];
                count++;
            }
        }

        return (double) sum / count;
    }

    //функція знаходження середнього геометричного
    private double findGeometric() {
        long product = 1;
        int count = 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                product *= matrix[i][j];
                count++;
            }
        }
        //додаємо модуль т.я. в матриці присутні від'ємні елементи
        return Math.pow(Math.abs(product), 1.0 / count);
    }
}
