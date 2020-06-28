import java.util.Scanner;

public class Zadacha12 {
    public static void main(String[] args) {
        System.out.println("Введите вашу строку: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        text = text.replace(" ", "");
        System.out.println("Получившийся результат: " + text);
    }
}

