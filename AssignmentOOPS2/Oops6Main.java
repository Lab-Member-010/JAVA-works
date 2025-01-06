class Oops6{
  	private int room;
  	private int  hall;
  	private int price;
   	public Oops6(){
      	}  
	public Oops6(int r, int h, int p){	  
		this.room=r;
		this.hall=h;
		this.price=p;
      	}
	public int getR(){
		return  room; 
	}  
	public  int getH(){
		return  hall; 
	}
	public  int getP(){
		return  price; 
	}
  	void show(){
     		System.out.println("RoomArea="+room);
	 	System.out.println("HallArea="+hall);
		System.out.println("Price="+price);
  	}
} 
class Oop6 extends Oops6{
	private int room2;
	static int  totalPrize;
	public Oop6(){
	}
	public Oop6(int x,int y,int a,int z){
		super(x,y,z);
		this.room2=a;
		this.totalPrize+=z;
	}
	void show(){
		System.out.println("RoomArea="+getR());
		System.out.println("Room2Area="+room2);
		System.out.println("HallArea="+getH());
		System.out.println("Price="+getP());
		System.out.println("totalPrize="+totalPrize );
	}
} 
class Oops6Main{
	public static void main(String args[]){
	      	Oop6 obj = new Oop6(100,100,300,400000);
	      	Oop6 obj1 = new Oop6(100,100,400,500000);
		Oop6 obj2 = new Oop6(100,100,500,600000);
	   	obj.show();
   	}
}


