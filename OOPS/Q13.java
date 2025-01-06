import java.util.Scanner;
	class Q13{
		private int r;
		private double a;
		public Q13(int r){
			this.r=r;
		}
		public void setValueRadius(int i){
			this.r=i;
		}
		public void calc(){
			this.a=3.14*r*r;
		}
		public double display(){
			return a;
		}
	}	
	class TestMain{
		public static void main(String args[]){
			Q13 obj=new Q13(5);
			Scanner scn=new Scanner(System.in);
			System.out.print("Enter radius: ");
			int i=scn.nextInt();
			obj.setValueRadius(i);
			obj.calc();
			System.out.println("Area: "+obj.display());	
		}
	}
	
