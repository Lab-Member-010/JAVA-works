class Pattern63{
    	public static void main(String[] args){
        	char ch=65;
        	for(int i=1;i<=9;i=i+2){
            		for(int j=9;j>=i;j--){
                		System.out.print(" ");
            		}
            		for(int j=1;j<=i;j++){
                		System.out.print(" "+ch);
                		ch++;
            		}
            		ch=65;
        	    	System.out.println();
        	}
    	}
}
