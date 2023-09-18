import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GraphReader {
    public void read(String filename) {
        try {
            String filepath = System.getProperty("user.dir") + "/" + filename;
            File file = new File(filepath);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
