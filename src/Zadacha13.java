import java.util.Scanner;

public class Zadacha13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String text1 = scanner.nextLine();
        System.out.println("Введите вторую строку: ");
        String text2 = scanner.nextLine();

        if (text1.length() > text2.length()) {
            System.out.println("Строка с большей длинной: " + text1);
        } else if (text1.length() < text2.length()) {
            System.out.println("Строка с большей длинной: " + text2);
        } else System.out.println("Введенные строки одинаковой длины!");
    }
}

