class Age{
	public static void main (String[] args){
		
		System.out.print("Name is " + args[0] + "\n");
		System.out.print("Age is " + args[1] + "\n");
		int age;
		age = Integer.parseInt(args[1]);
		System.out.print("the age after 5 years will be : " + (age + 5));
	}
}
