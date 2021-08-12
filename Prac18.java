class superclass{
	int x,y,z;
	superclass(int p,int q,int r){
		x = p;
		y = q;
		z = r;
		System.out.println("A is : " +x +" B is : " +y +" C is : " +z);
	}
}
class subclass extends superclass{
	subclass(int a, int b, int c){
		super(a,b,c);
	}
}
class Prac18{
	public static void main(String args[]){
		subclass obj = new subclass(1,2,3);
	}	
}