class this_keyword{
	int i;
	private int j;

	/*
	this_keyword(int x,int y){
		i=x;
		j=y;
		System.out.println("diffrent name arguments : ");
	}
		this_keyword(int i,int j){
		i=i;
		j=j;
		System.out.println("same name arguments : ");
	}
	*/
	
	this_keyword(){
		this(8,8); //invoke current class constructor
		System.out.println("Inside default constructor i: "+i+" j:"+j);
		this.show();//invoke current class method
	}
	
		this_keyword(int i,int j){
		this.i=i;  //refer current class instance
		this.j=j; //refer current class instance
	}
	
	void print(){
	System.out.println("same arguments name with this keyword i: "+i+" j:"+j);
	}
	
	this_keyword returns(this_keyword o1){
		System.out.println("Value of Variable i: " + o1.i);
		System.out.println("Value of Variable j: " + o1.j);
		return this; //return the current class instance from the method
	}

	void show(){
		returns(this); //passed as an argument in the method call.
	}

	this_keyword(this_keyword o1){
		System.out.println("This is Copy constructor");
	}
	void makeCopy(this_keyword o1){
		new this_keyword(this); //passed as argument in the constructor call.
		this.i = o1.i;
		this.j = o1.j;
	}

}

class this_example{
		public static void main(String[] args){
		this_keyword obj=new this_keyword(3,4);
		obj.print();
		this_keyword obj1 = new this_keyword(8,9);
		obj1.print();
		this_keyword obj2 = new this_keyword();
		obj2.makeCopy(obj);
		obj2.print();
	}	
}
