import java.util.Scanner;

public class Matrix {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы: ");
        int amountRows = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы: ");
        int amountColumns = scanner.nextInt();
        int matrix [][] = new int[amountRows][amountColumns];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < amountRows; i++) {
            for (int j = 0; j < amountColumns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < amountColumns; i++) {
            System.out.print(matrix[0][i] * 3 + " ");
        }
    }
}
