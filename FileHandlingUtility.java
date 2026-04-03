import java.io.*;

public class FileHandlingUtility {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello Internship Task");
            writer.close();

            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}