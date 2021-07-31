class demo{
	static int count = 0;
	private demo() {
    System.out.println("This is a private constructor.");
  }
  public static void instanceMethod() {
    demo obj = new demo();
	count++;
  }
}

class PrivateConst{
	public static void main(String args[]){
		demo.instanceMethod();
		demo.instanceMethod();
		System.out.println("there are total " +demo.count +" instances.");
	}
}