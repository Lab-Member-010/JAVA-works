import java.util.Scanner;
class String8{
	public static void main(String args[]){
		System.out.println("Enter a String to count an occurrence char ");
		String s = new Scanner(System.in).nextLine();
		String8.occurrence(s);
	}
	public static void occurrence(String a){
		int c=0;
		int x = a.length();
		int y = a.length();
		for(int i=0; i<x; i++){
			if(i==y){continue;}
			else{
				c++;
				for(int j=0; j<x; j++){
					if(i==j){continue;}
					else{
						String m = ""+a.charAt(i);
						String n = ""+a.charAt(j);

						if(m.equals(n)){
						c++;
						}
					}
				}
			System.out.println(a.charAt(i)+" found in "+ c);
			c=0;
			}
		}
   	}
}
