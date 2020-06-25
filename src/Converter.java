import java.util.Scanner;

public class Converter {
    public static void main(String[] args){
        System.out.println("Input your number: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int decimalNumber = Integer.parseInt(number,2);
        System.out.println(decimalNumber);
    }

}