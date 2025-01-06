class Oops5{
	private int room;
	private int  hall;
	private int price;
  	public Oops5(){
         }
	public Oops5(int r, int h, int p ){
		this.room=r;
		this.hall=h;
		this.price=p;
      	}
	void show(){
	     	System.out.println("RoomArea: "+room);
		System.out.println("Hall Area: " +hall);
		System.out.println("Price: "+price);
  	}
}
class Oops5Main{
	public static void main(String ar[]){
		Oops5 obj = new Oops5(2000,4000,200000);
		obj.show();
	}
}
