import java.util.Scanner;
import java.util.Arrays;
class String13{
    private String str1;
    private String str2;
    public String13(String str1,String str2){
        this.str1=str1;
        this.str2=str2;
    }
    public boolean checkAnagram() {
        this.str1 = str1.replaceAll("\\s", "").toLowerCase();
        this.str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }
}
class TestMain13{
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String str1 = scn.next();
        System.out.print("Enter string 2: ");
        String str2 = scn.next();
        String13 obj=new String13(str1,str2);
        boolean areAnagrams = obj.checkAnagram();
        if (areAnagrams) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
}
