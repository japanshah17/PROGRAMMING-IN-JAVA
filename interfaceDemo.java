interface mother{
	abstract void eyes();
}
interface father{
	abstract void nose();
}
class Child implements mother,father{
	public void eyes(){
		System.out.println("EYES---MOTHER");
	}
    public void nose(){
		System.out.println("NOSE---FATHER");
	}
}
class interfaceDemo
{
	public static void main(String a[])
	{
		Child tobj=new Child();
		tobj.eyes();
		tobj.nose();
		Child sobj;
		sobj=tobj;
		sobj.eyes();
	}
}