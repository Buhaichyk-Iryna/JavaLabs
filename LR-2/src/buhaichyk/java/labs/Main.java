package buhaichyk.java.labs;

import java.util.Scanner; //система сканування клавіатури

public class Main {

    // Сканер для отримання даних, введених користувачем
    private static final Scanner SCANNER = new Scanner(System.in);


   // Задаємо матрицю з початковими значеннями
    private static int[][] matrix;
    private static int rows = 0;
    private static int columns = 0;

    //Границі для діапазону рандомних чисел
    private static final int MAX_RAND = 10;
    private static final int MIN_RAND= -10;

    //вивід меню  та парехід між ними
    public static void main(String[] args) {
        int customChose;

        do {
            printMainMenu(); // виводимо головне меню
            customChose = SCANNER.nextInt(); // отримуємо вибір користувача

            switch (customChose) {
                case 0 -> exit(); // говоримо "до побачення" :)
                case 1 -> RandomInputMatrix();
                default -> System.out.println("There is no such option. Please try again");
            }

            if (customChose < 3 && customChose != 0) {
                int secondCustomChose;
                do {
                    printMatrixMenu();
                    secondCustomChose = SCANNER.nextInt();

                    switch (secondCustomChose) {
                        case 0 -> System.out.println("Back to main Menu");
                        case 1 -> findMin();
                        case 2 -> findMax();
                        case 3 -> findArithmeticMean();
                        case 4 -> findGeometricMean();
                        default -> System.out.println("There is no such option. Please try again.");
                    }
                } while (secondCustomChose != 0);
            }
        } while (customChose != 0);
    }

    //Метод, який виводить головне меню
    public static void printMainMenu() {
        System.out.println("\nWelcome in the application for creating a matrix and actions with it\n" +
                "\nChoose option:\n" +
                "1. Create matrix\n" +
                "0. Exit");
    }

    //Метод, який ініціалізує матрицю
    private static int createMatrix(String nameOfInputNumber) {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.printf("Input the number  %s for matrix: ", nameOfInputNumber);
            number = scanner.nextInt();
            if (number > 0 && number <= 20) {
                return number;

            } else {
                System.out.print("It`s too many rows/column! You need input not more than 20!\n\n");
            }
        } while (true);
    }

    // Метод, який створюю матрицю та або робить рандомні значення, або заповнює введеними числами

    private static int[][] RandomInputMatrix() {
        Scanner scanner = new Scanner(System.in);

        int cols = createMatrix("columns");
        int rows = createMatrix("rows");
        int[][] resultMatrix = new int[rows][cols];

        System.out.print("Enter the values of the matrix manually or generate randomly? [m|r]");
        boolean isManually = scanner.next().equals("m");

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                if (isManually) {
                    System.out.print("Input matrix element [" + i + "][" + j + "]: ");
                    resultMatrix[i][j] = scanner.nextInt();
                } else {
                    int random = (int) (Math.random() * (MAX_RAND - MIN_RAND) + MIN_RAND);
                    System.out.print(" " + random);
                    resultMatrix[i][j] = random;
                }
            }
            System.out.println();
        }
        if (isManually){
            System.out.println("Your matrix: ");
            for (int i = 0; i < rows; ++i) {
                for (int j = 0; j < cols; ++j){
                    System.out.print(" " + resultMatrix[i][j]);
                }
                System.out.println();
            }
        }
        return resultMatrix;
    }
    /**
     * Метод, який виводить меню для роботи з матрицею
     */
    private static void printMatrixMenu() {
        System.out.println("\nPlease choose option:\n" +
                "1. Find min element\n" +
                "2. Find max element\n" +
                "3. Find arithmetic mean\n" +
                "4. Find geometric mean\n" +
                "0. Back");
    }

    /**
     * Метод, який знаходить та виводить у консоль
     * максимальний елемент матриці
     */
    private static void findMax() {
        int max = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("The maximum element is matrix[" + maxRow + "][" + maxCol + "] = " + max);
    }

    /**
     * Метод, який знаходить та виводить у консоль
     * мінімальний елемент матриці
     */
    private static void findMin() {
        int min = matrix[0][0];
        int minRow = 0;
        int minCol = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    minRow = i;
                    minCol = j;
                }
            }
        }

        System.out.println("The minimum element is matrix[" + minRow + "][" + minCol + "] = " + min);
    }

    /**
     * Метод, який знаходить та виводить у консоль
     * геометричне середнє для матриці
     */
    private static void findGeometricMean() {
        double product = 1.0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                product *= matrix[i][j];
            }
        }

        double geometricMean = Math.pow(product, 1.0 / (rows * columns));
        System.out.println("The geometric mean of the matrix is " + geometricMean);
    }

    /**
     * Метод, який знаходить та виводить у консоль
     * середнє арифметичне для матриці
     */
    private static void findArithmeticMean() {
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }

        double arithmeticMean = sum * 1.0 / (rows * columns);
        System.out.println("The arithmetic mean of the matrix is " + arithmeticMean);
    }

    /**
     * Метод, який закінчує роботу з додатком
     */
    public static void exit() {
        System.out.println("\nBye! Thank you for using our app.\n");
    }
}