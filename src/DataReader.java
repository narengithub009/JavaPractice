import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\naren\\OneDrive\\Desktop\\test.txt");
        BufferedReader reader=new BufferedReader(new FileReader(file));
        while(reader.readLine()!=null){
            System.out.println(reader.readLine());
        }
    }
}
