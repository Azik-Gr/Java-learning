import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите бинарное число: ");
        String binaryNumber = scanner.nextLine();
        String regex = "[0-1]+";
        if (binaryNumber.length( ) > 32 || !binaryNumber.matches(regex)) {
            throw new IllegalArgumentException("Веденное значение слишком большое или не является бинарным числом!");
        }
        if (binaryNumber.length( ) == 32 && binaryNumber.startsWith("1")) {
            char[] chars = binaryNumber.toCharArray( );
            for (int i = 1; i < chars.length; i++) {
                chars[i] = chars[i] == '1' ? '0' : '1';
            }
            String numb1 = new String(chars);
            System.out.println(-1 * binToDec(numb1.substring(1)) - 1);
        } else System.out.println(binToDec(binaryNumber));
    }

    public static Integer binToDec(String s) {
        String[] nums = s.split("");
        int decNum = 0;
        for (int i = 0; i < nums.length; i++) {
            decNum += Integer.parseInt(nums[i]) * (int) Math.pow(2, nums.length - i - 1);
        }
        return decNum;
    }
}

