class Pattern89{
	public static void main(String args[]){
		int i,j;
		for(i=1;i<=11;i+=2){
			for(j=11;j>=i;j-- ){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){
				if(j%2==0){
					System.out.print(" "+0);
				}else{
					System.out.print(" "+1);
				}
			}
			System.out.println();
		}
	}
}
