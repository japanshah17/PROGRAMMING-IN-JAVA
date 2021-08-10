class A{
	final void show(){
		System.out.println("Class A");
	}
}
class overriding extends A{
	void show(){
		System.out.println("Class B");
	}
		public static void main(String args[]){
		A obja = new A();
		overriding objb = new overriding();
		objb.show();
	}
}
