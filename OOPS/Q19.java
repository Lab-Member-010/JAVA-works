import java.util.Scanner;
	class Q19{
		private int id[]=new int[10];
		private String name[]=new String[10]; 
		private int age[]=new int[10];
		private int score[]=new int[10];
		public Q19(int id[],String name[],int age[],int score[]){
			for(int i=0;i<10;i++){
				this.id[i]=id[i];
				this.name[i]=name[i];
				this.age[i]=age[i];
				this.score[i]=score[i];
			}
		}
		public void display1(){
			for(int i=0;i<10;i++){
				System.out.print(id[i]+" | "+name[i]+" | "+age[i]+" | "+score[i]+"\n");
			}
			System.out.println();
		}
		public void scoreSort(){
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					if(score[i]<=score[j]){
						int temp=score[i];
						score[i]=score[j];
						score[j]=temp;
						
						temp=id[i];
						id[i]=id[j];
						id[j]=temp;
						
						temp=age[i];
						age[i]=age[j];
						age[j]=temp;
						
						String temp1=name[i];
						name[i]=name[j];
						name[j]=temp1;
						
					}
				}
			}
		}
		public void display2(){
			for(int i=0;i<10;i++){
				if(score[i]<=100 && score[i]>=90)
				System.out.print(id[i]+" | "+name[i]+" | "+age[i]+" | "+score[i]+"\n");
			}
			System.out.println();
			for(int i=0;i<10;i++){
				if(score[i]<90 && score[i]>=65)
				System.out.print(id[i]+" | "+name[i]+" | "+age[i]+" | "+score[i]+"\n");
			}
			System.out.println();
			for(int i=0;i<10;i++){
				if(score[i]<65 && score[i]>=50)
				System.out.print(id[i]+" | "+name[i]+" | "+age[i]+" | "+score[i]+"\n");
			}
			System.out.println();
			for(int i=0;i<10;i++){
				if(score[i]<50 && score[i]>=0)
				System.out.print(id[i]+" | "+name[i]+" | "+age[i]+" | "+score[i]+"\n");
			}
		}

	}	
	class TestMain{
		public static void main(String args[]){
			int id[]={1,2,3,4,5,6,7,8,9,10};
			String name[]={"a","b","c","d","e","f","g","h","i","j"};
			int age[]={18,18,17,21,22,19,20,20,17,18};
			int score[]={90,56,67,43,55,98,28,15,69,40};
			Q19 obj=new Q19(id,name,age,score);
			obj.display1();
			obj.scoreSort();
			obj.display2();
		}
	}
