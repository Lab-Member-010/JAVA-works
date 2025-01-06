	import java.util.Scanner;
	class Q14{
		private double x;
		private double y; 
		private double r;
		public Q14(double x,double y){
			this.x=x;
			this.y=y;
		}
		public void setValueX(double i){
			this.x=i;
		}
		public void setValueY(double j){
			this.y=j;
		}	
		public double add(){
			this.r=x+y;
			return r;
		}
		public double power(){
			this.r=Math.pow(x,y);
			return r;
		}
		public double multiply(){
			this.r=x*y;
			return r;
		}
		public void display(){
			System.out.println("Sum: "+add());
			System.out.println("Multiply: "+multiply());
			System.out.println("Power: "+power());
		}
	}	
	class TestMain{
		public static void main(String args[]){
			Q14 obj=new Q14(3,4);
			Scanner scn=new Scanner(System.in);
			System.out.print("Enter x: ");
			double i=scn.nextInt();
			obj.setValueX(i);
			System.out.print("Enter y: ");
			double j=scn.nextInt();
			obj.setValueY(j);
			obj.display();		
		}
	}

