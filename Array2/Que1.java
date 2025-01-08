/*
1.Write a Java program to sort a numeric array and a string array.
2.Write a Java program to sum values of an array .
3.Write a Java program to calculate the average value of array element .
4.Write a Java program to test if an array contains a specific value .
5.Write a Java program to find the index of an array element .
*/

import java.util.Scanner;
class Que1{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		int n=scn.nextInt();
		String arr[]=new String[n];
		int i,j=0;
		for(i=0;i<n;i++){
			System.out.print("Enter Element "+i+": ");
			arr[i]=scn.next();
		}
		for(i=0;i<n;i++){
			for(j=0;j<n-1;j++){
				if(arr[j].compareTo(arr[j + 1]) > 0){
					String temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
    }
}



/*


class Que1{
	public static void main(String args[]){
		String str[]={"Ajeeeet","ajeeet","vishal","ajit","abhay"};
		for(int i=0;i<str.length;i++){
			for(int j=i+1;j<str.length;j++){
				str[i]=str[i].toUpperCase();
				str[j]=str[j].toUpperCase();
				String temp=sortString(str[i],str[j]);
				if(temp.equals(str[j])){
					str[j]=str[i];
					str[i]=temp;
				}
			}
		}
		for(int i=0;i<str.length;i++){
			System.out.print(str[i]+" ");
		}
	}
	public static String sortString(String s1,String s2){
		String ans="";
		for(int i=0;i<s1.length();i++){
			char ch1=s1.charAt(i);
			char ch2=s2.charAt(i);
			if(ch1<ch2){
				ans=s1;
				break;
			}
			if(ch1>ch2){
				ans=s2;
				break;
			}
		}
		return ans;
	}
}


*/
