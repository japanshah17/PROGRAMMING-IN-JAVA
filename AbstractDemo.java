abstract class Parent{
	
	abstract void call();
	abstract void callme();
	Parent(){
		System.out.println("Constructor of Abstract class");
	}
	void show(){
		System.out.println("show() method of parent");
	}
}
abstract class Child extends Parent{
	void call()
	{
		System.out.println("abstarct call() method of child");
	}

}
class subChild extends Child{
		void callme()
	{
		System.out.println("abstarct callme() method of subchild");
	}
}


class AbstractDemo
{
	public static void main(String[] a)
	{
		subChild obj=new subChild();
		obj.call();
		obj.callme();
		
		Parent ch;
		ch=obj;
		ch.show();
	}
}