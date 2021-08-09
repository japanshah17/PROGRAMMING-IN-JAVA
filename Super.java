//Practical - 18
class Animal{  
	int a;
	Animal(int p){
		a = p;
	}
}  
class Dog extends Animal{ 
	int a;
	Dog(int m,int n){
		super(m);
		a = n;
	}
	void show(){
		System.out.println("super a is : " +super.a +" and sub a is : " +a);
	}
}  
class Super{  
	public static void main(String args[]){  
		Dog d1=new Dog(1,2);  
		d1.show();
	}  
}	