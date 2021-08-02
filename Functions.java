class Functions{
	private int n1 = 5;
	private int n2 = 10;
		void printhello(){
			System.out.println("Hello");
		}
		int add(int a, int b){
			int c = a+b;
			return c;
		}
		Functions change(int a, int b){
			Functions obj0 = new Functions();
			obj0.n1 = a;
			obj0.n2 = b;
			return obj0;
		}
		
		
	public static void main(String args[]){
		Functions obj = new Functions();
		obj.printhello();
		int ans = obj.add(5,3);
		System.out.println("the addition is : " +ans);
		Functions obj1 = obj.change(15,30);
		System.out.println("n1 is: " +obj1.n1 +" n2 is " +obj1.n2);
	}
}
