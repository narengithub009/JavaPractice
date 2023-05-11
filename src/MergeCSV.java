import java.io.*;

public class MergeCSV {
    public static void main(String[] args) throws IOException {
        String[] fileNames = {"file1.csv", "file2.csv", "file3.csv"}; // change the file names to the names of the CSV files to be merged
        String mergedFileName = "merged.csv"; // change the file name to the name of the CSV file to be created

        BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFileName));

        for (String fileName : fileNames) {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
        }

        writer.close();
    }
}
