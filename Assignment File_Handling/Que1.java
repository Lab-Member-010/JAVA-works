import java.io.*;
import java.util.Scanner;
class Que1{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		String fileName="q1.txt";
		File file=new File(fileName);
		try{
			if(file.exists()){
				FileInputStream fin=new FileInputStream(file);
				int character;
				while((character=fin.read())!=-1){
					System.out.print((char)character);
				}
			}else{
				try{
					if(file.createNewFile()){
						System.out.print("File Created");
					}else{
						System.out.print("File Already Exist");	
					}
				}catch(Exception e){
					e.printStackTrace();
				}
				System.out.print("Enter Content:");
				String fileContent=scn.nextLine();
				FileOutputStream fout=new FileOutputStream(file);
				byte b[]=fileContent.getBytes();
				fout.write(b);
			}
		}catch(Exception f){
			f.printStackTrace();	
		}
	}
}
