class Pattern64{
    	public static void main(String[] args){
        	for(int i=1;i<=9;i=i+2){
            		for(int j=9;j>=i;j--){
	                	System.out.print(" ");
            		}
            		for(int k=1;k<=i;k++){
                		if(k==1||i==k||i==9)
                    			System.out.print(" *");
                		else
                    			System.out.print(" _");
            		}
            		System.out.println();
        	}
    	}
}
