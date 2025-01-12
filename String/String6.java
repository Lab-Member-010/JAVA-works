import java.util.Arrays;
class String6{
	public static String reverse(String str) {
        	String reversed = "";
         	for(int i=str.length()-1;i>=0;i--){
            		reversed+=str.charAt(i);
             	}
        	return reversed;
	 }
	public static void main(String ar[]){		 
		String str="";
		int count=0;
		String s1="aaabbbacccababacccaabb";
		String test="";
		for(int i=0;i<s1.length();i++){	
			for(int j=i;j<s1.length();j++){	   
			        char ch=s1.charAt(j);
			        str=str+ch;
				if(str.equals(String6.reverse(str))){	   
					test+=str+" ";	   
					count++;	  
				}
			}
			str="";
		}   
		String[] words=test.split(" ");
		String[] temp = new String[words.length];
		int index = 0;
		for(int i=0;i<words.length;i++){
			boolean avl=false;
			for(int j=0;j<i;j++){		  
				if(words[i].equals(words[j])){
					avl=true;
					break;
			  	}
			}	
             		if(!avl){
                		temp[index++] = words[i];			  
			}
		}	  
		for(int i=0;i<temp.length;i++){
			if(temp[i]!=null)
			System.out.println(temp[i]);  
		}
	}
}
