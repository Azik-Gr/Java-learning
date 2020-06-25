import java.util.Scanner;

public class Zadacha6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три числа:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int s = (x + y + z) / 3;
        System.out.println("Среднее значение равно: " + s);
        if (s / 2 > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
