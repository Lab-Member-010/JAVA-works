import java.util.Scanner;
class String11{
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter the name of the person: ");
            String name = scn.nextLine();
            name = name.toLowerCase();
            int vowelCount = 0;
            for (int i = 0; i < name.length(); i++) {
                char ch = name.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }
            System.out.println("Number of vowels in the name: " + vowelCount);
    }
}
