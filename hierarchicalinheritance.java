class A{
	int a;
	A(){
		System.out.println("Constructor of A");
	}
}
class B extends A{
	int b;
	B(){
		System.out.println("Constructor of B");
	}
}
class C extends A{
	int c;
	C(){
		System.out.println("Constructor of C");
	}
}
class hierarchicalinheritance{
	public static void main(String args[]){
		A obja = new A();
		obja.a = 5;
		System.out.println("obja.a is : " +obja.a);
		
		B objb = new B();
		objb.a = 7;
		objb.b = 10;
		System.out.println("objb.a is : " +objb.a);
		System.out.println("objb.b is : " +objb.b);
		
		C objc = new C();
		objc.a = 1;
		objc.c = 3;
		System.out.println("objc.a is : " +objc.a);
		System.out.println("objc.c is : " +objc.c);
	}
}