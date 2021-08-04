class this_keyword{
	int i;
	int j;
	int ar;
	
	/*public this_keyword(int x,int y){
		i=x;
		j=y;
		System.out.println("diffrent name : ");
	}
		public this_keyword(int i,int j){
		i=i;
		j=j;
		System.out.println("same name : ");
	}
	*/
		public this_keyword(int i,int j){
		i=i;
		j=j;
		System.out.println("same name with this keyword : ");
	}
	
	int area(){
		System.out.println("Inside area method");
		ar=i*j;
		return(ar);
	}
	
	void display(){
		System.out.println("area is " +ar);
	}
	
	public static void main(String[] args){
		this_keyword rectangle=new this_keyword(3, 4);
		rectangle.area();
		rectangle.display();

	}
}
