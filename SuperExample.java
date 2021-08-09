class Animal{  
	int a;
	String color="Animal->white"; 	
	
	void food(){
		System.out.println("Animal->Anything");
	}
	
	Animal(){
		System.out.println("Animal class constructor");
	}
	
	Animal(int p){
		a = p;
	}
}  
class Dog extends Animal{ 
	int a;
	String color="Dog->black";  
	
	void food(){
		System.out.println("Dog->Bones");
	}
	
	Dog(){
		super();//calls constructor of Animal class
		System.out.println("Dog class constructor");
	}
	Dog(int m,int n){
		super(m);
		a = n;
	}
	void print(){  
		System.out.println(color);//prints color of Dog class
		System.out.println(super.color);//prints color of Animal class
		food();//calls food() method of Dog class
		super.food();//calls food() method of Animal class		
	} 
	void show(){
		System.out.println("super a is : " +super.a +" and sub a is : " +a);
	}
}  
class SuperExample{  
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.print();  
		Dog d1=new Dog(1,2);  
		d1.show();
	}  
}	