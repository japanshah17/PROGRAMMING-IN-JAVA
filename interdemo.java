interface mother{
	default void eyes(){
		System.out.println("EYES---MOTHER");
	}

}
interface father{
		static void nose(){
		System.out.println("NOSE---FATHER");
	}
}
class Child implements mother,father{

}
class interDemo
{
	public static void main(String a[])
	{
		Child tobj=new Child();
		tobj.eyes();
		father.nose();
	}
}