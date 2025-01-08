import java.util.Scanner;
import java.util.Arrays;
class A5{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		int n=scn.nextInt();
		int arr[]=new int[n];
		int i,j=0;
		for(i=0;i<n;i++){
			System.out.print("Enter Element "+i+": ");
			arr[i]=scn.nextInt();
		}
		Arrays.sort(arr);
		int newArray[]=removeDuplicates(arr);
		System.out.print("Enter nth largest term to find: ");
		int large=scn.nextInt();
		System.out.print("Enter nth smallest term to find: ");
		int small=scn.nextInt();
		large=large-1;
		small=small-1;
		System.out.println("largest term is: "+arr[n-1-large]);
		System.out.println("Smallest term is: "+arr[small]);
	}
	public static int[] removeDuplicates(int[] arr) {
        	int[] uniqueArray = new int[arr.length]; 
        	int index = 0; 
        	for(int i = 0; i < arr.length; i++) {
            		boolean isDuplicate = false;
            		for(int j = 0; j < index; j++) {
                		if(arr[i] == uniqueArray[j]) {
                	    		isDuplicate = true;
                	    		break;
                		}
            		}
            		if (!isDuplicate) {
                		uniqueArray[index++] = arr[i];
            		}
        	}
        return Arrays.copyOf(uniqueArray, index);
    }
}
