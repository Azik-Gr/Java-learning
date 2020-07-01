import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWriteFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fileName = scanner.nextLine( );
        String text;
        int counter = 0;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while ((text = bufferedReader.readLine( )) != null) {
                counter++;
                System.out.println(text);
            }
        } catch (IOException e) {
            e.printStackTrace( );
        }
        System.out.println("Введите "+counter+" строки текста:");
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            for (int i = 0; i < counter; i++) {
                text = scanner.nextLine();
                fileWriter.write(text+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace( );
        }
    }
}
