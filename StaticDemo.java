class Stat{
	{
		System.out.println("non static of Stat class");
	}
	static
	{
		System.out.println("static of Stat class");	
	}
}

class StaticDemo{
		static
		{
			System.out.println("static of StaticDemo class");
		}
		
		{
			System.out.println("non static of StaticDemo class");
		}
	public static void main(String args[]){
		Stat sobj = new Stat();
		StaticDemo obj = new StaticDemo();
		
	}
}