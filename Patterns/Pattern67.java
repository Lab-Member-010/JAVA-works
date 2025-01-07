class Pattern67{
    	public static void main(String[] args){
        	char ch=65;
        	for(int i=1;i<=9;i=i+2){
            		for(int j=9;j>=i; j--){
                		System.out.print(" ");
            		}
            		for(int j=1;j<=i;j++){
                		if(i==j||i==9||j==1){
                    			System.out.print(" "+ch);
                		}else{
                    			System.out.print("  ");
                		}
            		}
            		ch++;
            		System.out.println();
        	}
    	}
}
