class A{
	int a;
	
}
class B extends A{
	int b;
}
class SingleInheritance{
	public static void main(String args[]){
		A obja = new A();
		B objb = new B();
		obja.a = 5;
		objb.a = 7;
		objb.b = 10;
		System.out.println("obja.a is : " +obja.a);
		System.out.println("objb.a is : " +objb.a);
		System.out.println("objb.b is : " +objb.b);
	}
}