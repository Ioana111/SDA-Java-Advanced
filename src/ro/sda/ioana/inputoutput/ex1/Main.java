package ro.sda.ioana.inputoutput.ex1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\marin\\OneDrive\\Desktop\\newfile.txt");

        StringBuffer fileContent = new StringBuffer();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                fileContent.append(fileLine);
                fileContent.append("\n");
            }
        }

        String newFileContent = fileContent.toString().replace("LALA","BUNA");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file)))
        {
            bufferedWriter.write(newFileContent);
        }
    }

}
