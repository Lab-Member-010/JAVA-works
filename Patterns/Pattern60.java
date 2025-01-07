public class Pattern60{
    	public static void main(String[] args){
        	for(int i=1;i<=5;i++){
            		for(int j=5;j>=i;j--){
                		System.out.print(" ");
            		}
            		for(int j=1;j<=i;j++){
                		if(j==1 || i==j || i==5){
                    			System.out.print(" X");
                		}else{
                    			System.out.print(" _");
                		}
            		}
            		System.out.println();
        	}
    	}
}
