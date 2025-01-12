import java.util.Scanner;
class String10{
    private String str;
    String10(String str){
        this.str=str;
    }
    public boolean startsWithVowel(String word) {
        String[] words = str.split("\\s");
        int count = 0;
        char firstChar = Character.toLowerCase(word.charAt(0));
        for (String element : words) {
            if (startsWithVowel(element)) {
                count++;
            }
        }
        System.out.println("Number of words starting with vowel: " + count);
        if(firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u'){
            return true;
        }else{
            return false;
        }
    }
}
class TestMain{
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scn.nextLine();
        String10 obj=new String10(str);
        obj.startsWithVowel(str);
    }
}
