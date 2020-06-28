import java.util.Scanner;

public class Zadacha7 {
    final static int X = 7;
    final static int Y = 10;
    final static int Z = 15;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int number = scanner.nextInt();
        if (number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах");
        } else System.out.println("Такой константы нет!");
    }
}

