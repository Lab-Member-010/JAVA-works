class Pattern82{
    	public static void main(String[] args){
        	for(int i=1;i<=7;i=i+2){
            		for(int j=7;j>=i;j--){
                		System.out.print(" ");
            		}
            		for(int k=1;k<=i;k++){
                		if(i==k||k==1){
                    			System.out.print(" *");
                		}else{
                    			System.out.print(" _");
                		}
            		}
            		System.out.println();
        	}
        	for(int i=5;i>=1;i=i-2){
            		for(int j=7;j>=i;j--){
                		System.out.print(" ");
            		}
            		for(int k=1;k<=i;k++){
                		if(i==k || k==1){
                    			System.out.print(" *");
                		}else{
                    			System.out.print(" _");
                		}
            		}
            		System.out.println();
        	}
    	}
}
