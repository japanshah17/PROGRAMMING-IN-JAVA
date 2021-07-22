import java.util.Scanner;
class demo{
	String name;
	int age;
	
	//default 
	//demo(){
	//}
		
	//no arguments 
	demo(){
		System.out.println("-> no args constructor called");	
	}
	
	//parameterized constructor	
	demo(String n,int a){
		name = n;
		age = a;
	}
	
	//copy constructor
	demo(demo object){
		name = object.name;
		age = object.age;
	}
}
class Constructor{
	public static void main(String args[]){
		demo obj = new demo();
		demo obj1 = new demo("Japan",5);
		demo obj2 = obj1; // copy Constructor
		demo obj3 = new demo(obj1); // copy Constructor
		System.out.println("-> parameterized constructor : ");
		System.out.println("the name of obj1 is : "+obj1.name);
		System.out.println("-> copy constructor : ");
		System.out.println("the name of obj2 is : "+obj2.name);
		System.out.println("the name of obj3 is : "+obj3.name);	
	}
}