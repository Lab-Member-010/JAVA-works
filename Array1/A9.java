class A9{
	public static void main(String args[]){
		int arr[]={1,5,7,1,2,3,5,4};
		int k=6;
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length-1;j++){
				if(arr[i]+arr[j]==k){
					count++;
				}
			}
		}
		System.out.print("Total Subrrays: "+count);
	}
}
