import java.util.Scanner;
class Student{
	private int rollno;
	private int percentage;
	Student(int x,int y){
		this.rollno=x;
		this.percentage=y;
	 }
	 void show(){
	 	System.out.println("rollno="+rollno);
	 	System.out.println("percentage="+percentage);
	  }
	  public int get(){ 
	  	return rollno;
	  }
	  public int get1(){   
		return percentage;
	  }
}  
class CollegeStudent extends Student{
	private int semester;
    	CollegeStudent(int x,int y,int z){
    		super(x,y);
     		this.semester=z;
	}
   	public int get2(){
   		return  semester; 
   	}
   	void show(){
		System.out.println("rollno="+get());
	  	System.out.println("percentage="+get1());
	  	System.out.println("semester="+semester);
	}
}
class SchoolStudent extends Student{
	private int classname;
  	public SchoolStudent(int x,int y,int z){
		super(x,y);
		this.classname=z;
	}
	void show(){
	 	System.out.println("rollno="+get());
	 	System.out.println("percentage="+get1());
	  	System.out.println("classname="+classname);
	}
}
class Oops8Main{
	public static void main(String ar[]){
 		CollegeStudent cs1= new CollegeStudent(1,60,2);
		CollegeStudent cs2= new CollegeStudent(2,70,3);
		CollegeStudent cs3= new CollegeStudent(3,80,4);
		SchoolStudent ss1= new SchoolStudent(4,90,10);
		SchoolStudent ss2= new SchoolStudent(5,80,12);
		Scanner sc= new Scanner(System.in);
		System.out.println("enter roll no: ");
		int count=0;
		int x= sc.nextInt();
   		Student st[]= new Student[5];
		st[0]=cs1;
   		st[1]=cs2;
   		st[2]=cs3;
   		st[3]=ss1;
   		st[4]=ss2;
		for(Student s1:st){
			if(x==s1.get())
				System.out.println(s1.getClass().getName());
			if(s1.get1()>75)
				count++;
		}
		System.out.println("more than 75 percentage  student are="+count);
	}
}
