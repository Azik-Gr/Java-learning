import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = scanner.nextInt( );
        int[] myArray = new int[size];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            myArray[i] = scanner.nextInt( );
        }
        int j, x;
        for (int i = 1; i < size; i++) {
            j = 0;
            while (j < i) {
                if (myArray[j] <= myArray[i]) {
                    j++;
                } else break;
            }
            x = myArray[i];
            for (int k = i; k > j; k--) {
                myArray[k] = myArray[k - 1];
            }
            myArray[j] = x;
        }
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < size; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}
