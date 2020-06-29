import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = scanner.nextInt();
        System.out.println("Введите элементы массива: ");
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt();
        }
        int x;
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    x = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j+1] = x;
                }

            }

        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }

    }

}
