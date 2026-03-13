package practice;

import java.io.*;

public class Sample {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/input1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
