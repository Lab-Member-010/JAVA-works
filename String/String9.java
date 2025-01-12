class String9{
	public static void main(String args[]){
		String s = "Hello student you need to work heard";
		String n ="";
		int i=0;
		String[] ss = s.split(" ");
		for(String a : ss){
			if(a.length()>i){
			n = a;
			i = a.length();
			}
		}
		System.out.println("max = "+ n.length()+" "+ n);
	}

}
