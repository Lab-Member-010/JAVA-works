import java.util.Arrays;
class String7{
	public static void main(String se[]){
		String result="";
		String s2="aabbccdd";
		for (int i = 0; i < s2.length(); i++) {
            		char ch = s2.charAt(i);
		        if(result.indexOf(ch) == -1) {
                		result += ch;
            		}
        	}		 
		System.out.println(result); 
	}
}
