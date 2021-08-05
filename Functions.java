class Functions{
	private int n1 = 5;
	private int n2 = 10;
	static int number = 0;
		void printhello(){ //no return type, no argument
			System.out.println("Hello");
		}
		int sub(){ //return type, no argument
			int a = 10;
			int b = 5;
			int ans = a-b;
			return ans;
		}
		void mul(int a, int b){ //no return type, argument... pass by value
			int c = a*b;
			System.out.println("Multiplication is : " +c);
		}
		int add(int a, int b){ //return type, argument
			int c = a+b;
			return c; // returning value from method
		}

		Functions change(int a, int b){
			Functions obj0 = new Functions();
			obj0.n1 = a;
			obj0.n2 = b;
			return obj0; // returning object from method
		}
		
		static void update(Functions obj ){ 
			obj.number++;  
		}
		
	public static void main(String args[]){
		Functions obj = new Functions();
		obj.printhello();
		int ans = obj.add(5,3);
		System.out.println("the addition is : " +ans);
		Functions obj1 = obj.change(15,30);
		System.out.println("n1 is: " +obj1.n1 +" n2 is " +obj1.n2);
		
		System.out.println("number before = " + obj1.number);
		obj.update(obj);
		System.out.println("number after = " + obj1.number);
	}
}
