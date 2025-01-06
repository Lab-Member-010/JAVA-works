class Faculty{
	private int facultyid;
	private int salary;
	public void setFac(int x,int y){
		this. facultyid=x; 
		this. salary=y;
	}
	public int getFac1(){
		return  facultyid; 
	}
	public int getFac2(){
		return  salary; 
	}
}
class FullTime extends Faculty{
	private int basic;
	private int allowance;
	public void setFull(int x,int y,int z){
		this.basic = y;
		this.allowance = z;
		setFac(x,(y+z));
	}
	public void display(){
		System.out.println("full time:");
		System.out.println("id: "+getFac1());
		System.out.println("salary: "+getFac2());
		System.out.println("basic : "+basic);
		System.out.println("allowance: "+allowance);
	} 
}
class PartTime extends Faculty {
    	private int hour;
    	private int rate;
	public void setpart(int x,int y,int z){
		this.hour = y;
		this.rate = z;
		setFac(x,(y*z));
	}
	public void display(){
		System.out.println("part time:");
		System.out.println("id: "+getFac1());
		System.out.println("salary: "+getFac2());
		System.out.println("hour: "+hour);
		System.out.println("rate: "+rate);
	}
} 
class Oops7Main{
	public static void main(String ar[]){
		FullTime obj=new FullTime();
		obj.setFull(1,5000,500);
		obj.display();
		obj.setFull(2,4000,400);
		obj.display();
		PartTime ob=new PartTime();
		ob.setpart(1,5,600);
		ob.display();
		ob.setpart(2,2,400);
		ob.display();
	}
}
 
 
