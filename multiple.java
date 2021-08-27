interface A{
	abstract void a1();
}
interface B{
	abstract void b1();
}
class Child implements A,B{
	public void a1(){
		System.out.println("A1 METHOD OF INTERFACE A");
	}
    public void b1(){
		System.out.println("B1 METHOD OF INTERFACE B");
	}
}
class multiple
{
	public static void main(String a[])
	{
		Child tobj=new Child();
		tobj.a1();
		tobj.b1();
	}
}