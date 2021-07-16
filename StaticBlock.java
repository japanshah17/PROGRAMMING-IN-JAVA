class StaticBlock{
	static int i = 10;
	
	//STATIC BLOCK
	static{
		i = 5;
		System.out.println("static block called ");
	}

	public static void main(String args[]){

		System.out.println(i);
	}
}
