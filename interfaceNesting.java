interface out{
	public void show();
	interface in{
		//abstract void display();
		/*
		static void display(){
			System.out.println("Hello from show(inner interface)");
		}
		*/
		default void display(){
			System.out.println("Hello from display(inner interface)");
		}
	}
}
class Test implements out.in{
	public void show(){
		System.out.println("Hello from show(outer interface)");
	}
	/*
	public void display(){
		System.out.println("Hello from display(inner interface)");
	}
	*/
}
class interfaceNesting
{
	public static void main(String a[])
	{
		Test tobj=new Test();
		tobj.show();
		tobj.display();
		//out.in.display(); // to call static method of inner interface
	}
}