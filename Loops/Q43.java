class Q43{
	public static void main(String args[]){
		int n=10101;
		int i=0,r,sum=0;
		while(n!=0){
			r=n%10;
			n = n/10;
			sum += r*Math.pow(2,i);
			i++;
		}
		System.out.println("Decimal Number: "+sum);
	}
} 
