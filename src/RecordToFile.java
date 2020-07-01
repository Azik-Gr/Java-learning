import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecordToFile {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя файла: ");
        String fileName = bufferedReader.readLine( );
        String text;
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            do {
                System.out.println("Введите команду 'stop' для остановки ввода или введите текст: ");
                text = bufferedReader.readLine();
                if (text.equalsIgnoreCase("stop")) break;
                text= text+"\n";
                fileWriter.write(text);
            } while (!text.equalsIgnoreCase("stop"));
        } catch (IOException e) {
            e.printStackTrace( );
        }

    }
}
