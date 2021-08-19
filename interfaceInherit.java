interface P1{
	final int a = 5;
	public void display();
}

interface P2{
	final int b = 10;
	public void print();
}

interface P12 extends P1,P2{
	final int c = 15;
	public void show();
}

class Q implements P12{
	public void display(){
		System.out.println("a in P1: " +a);
	}
	public void print(){
		System.out.println("b in P2: " +b);
	}
	public void show(){
		System.out.println("c in P12: " +c);
	}
}

class interfaceInherit{
	public static void main(String [] args){
		Q obj = new Q();
		obj.display();
		obj.print();
		obj.show();
	}
}