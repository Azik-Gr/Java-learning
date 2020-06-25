import java.util.Scanner;

public class Zadacha7 {
    public static void main(String[] args) {
        int x = 7;
        int y = 15;
        int z = 10;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int number = scanner.nextInt();
        if (number == x || number == y || number == z) {
            System.out.println("Данное значение имеется в константах");
        } else System.out.println("Такой константы нет!");
    }
}

