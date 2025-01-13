package Class_28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HtmlFileRead {


    public static void main(String[] args) {
        // Specify the path to the HTML file
        String filePath = "C:\\Users\\Java Student PC-7\\Desktop\\Saima\\HTML\\div.html";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            StringBuilder sb = new StringBuilder();
            String line;

            // Read the file line by line
            while ((line = br.readLine()) != null) {
                // Remove HTML tags using regex
                line = line.replaceAll("<[^>]*>", "");  // Remove tags
                sb.append(line).append("\n");  // Append the text to StringBuilder
            }

            // Print the extracted text
            System.out.println(sb.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}





