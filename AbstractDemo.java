abstract class Parent{
	
	abstract void call();
	abstract void callme();
	
	void show(){
		System.out.println("show() method of parent");
	}
}
class Child extends Parent{
	void call()
	{
		System.out.println("abstarct call() method of child");
	}
	void callme()
	{
		System.out.println("abstarct callme() method of child");
	}
}



class AbstractDemo
{
	public static void main(String[] a)
	{
		Child obj=new Child();
		obj.call();
		obj.callme();
		
		Parent ch;
		ch=obj;
		ch.show();
	}
}