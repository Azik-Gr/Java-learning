import java.util.Scanner;

public class Array1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int arrayLength = scanner.nextInt();
        System.out.println("Введите элементы массива: ");
        int mass [] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            mass[i]= scanner.nextInt();
        }
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(mass[i]*2+" ");
        }
    }
}
