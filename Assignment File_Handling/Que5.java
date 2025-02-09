import java.io.*;
class Que5{
    public static void main(String[] args) {
        String file = "sample.txt";
        int wordCount = 0;
        int totalCharacters = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
                for (String word : words) {
                    totalCharacters += word.length();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        double averageWordSize = (double) totalCharacters / wordCount;
        System.out.println("Number of words in the file: " + wordCount);
        System.out.println("Average word size: " + averageWordSize);
    }
}
