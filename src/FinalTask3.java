import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара: ");
        double dollarRate = scanner.nextDouble();
        System.out.println("Введите сумму в рублях: ");
        double amountRubles = scanner.nextDouble();
        double sum = (double) amountRubles/dollarRate;
        System.out.format("%.2f",sum);
    }
}
