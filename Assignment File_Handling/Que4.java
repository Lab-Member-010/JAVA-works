import java.io.*;
class Que4{
    public static void main(String[] args) {
        String file = "sample.txt";
        char charToCount = 't';
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int character;
            while ((character = reader.read()) != -1) {
                char currentChar = (char) character;
                if (currentChar == charToCount) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The character 't' occurs " + count + " times in the file.");
    }
}
