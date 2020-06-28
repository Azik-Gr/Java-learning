import java.util.Scanner;

public class Zadacha14 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String s = scanner.nextLine();
        int x = Integer.parseInt(s);
        double y = x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
    }

}
