	import java.util.Scanner;
	class Q18{
		private int pid[]=new int[5];
		private int prize[]=new int[5]; 
		private int quantity[]=new int[5];
		
		public Q18(int pid[],int prize[],int quantity[]){
			for(int i=0;i<5;i++){
				this.pid[i]=pid[i];
				this.prize[i]=prize[i];
				this.quantity[i]=quantity[i];
			}
		}
		public int maxId(){
			int maxPrize=this.prize[0];
			int maxId=this.pid[0];
			for(int i=0;i<5;i++){
					if(maxPrize<prize[i]){
						maxPrize=prize[i];
						maxId=pid[i];
					}
			}
			return maxId;
		}
		public int totalPrize(){
			int total=0;
			for(int i=0;i<5;i++){
				total+=(quantity[i]*prize[i]);
			}
			return total;
		}
	}	
	class TestMain{
		public static void main(String args[]){
			int pid[]={1,2,3,4,5};
			int prize[]={40,60,55,30,45};
			int quantity[]={5,3,7,2,4};
			Q18 obj=new Q18(pid,prize,quantity);
			System.out.println("MaxId: "+obj.maxId());
			System.out.println("Total Price: "+obj.totalPrize());
		}
	}
