class Pattern65{
    	public static void main(String[] args) {
        	for(int i=0;i<5;i++){
            		for(int j=0;j<5-i-1;j++){
                		System.out.print(" ");
            		}
            		int value=1;
            		for(int j=0;j<=i;j++){
                		System.out.print(value+" ");
                		value=value*(i-j)/(j+1);
            		}
            		System.out.println();
        	}
    	}
}
