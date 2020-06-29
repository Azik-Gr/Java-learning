import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fileName = scanner.nextLine();
        String text;
        try {BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while ((text=bufferedReader.readLine())!=null){
                System.out.println(text);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
