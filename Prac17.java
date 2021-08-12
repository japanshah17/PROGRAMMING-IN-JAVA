class A{
	static int x = 1;
}
class B extends A{
	int x = 5;
	void display(){
		System.out.println("x of A using super keyword is: " +super.x);
		System.out.println("x of A using class name is: " +A.x);
		System.out.println("x of B is: " +this.x);
	}
}

class Prac17{
	public static void main(String [] args){
		B obj = new B();
		obj.display();
	}	
}