import java.util.Scanner;
class String14{
    private String str;
    String14(String str){
        this.str=str;
    }
    public boolean containsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);            
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
class TestMain14{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = scn.next();
        String14 obj=new String14(str);
        boolean containsOnlyDigit = obj.containsOnlyDigits(str); 
        System.out.println(str + " contains only digits: " + containsOnlyDigit);
    }  
}
