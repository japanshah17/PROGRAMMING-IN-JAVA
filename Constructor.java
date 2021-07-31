import java.util.Scanner;
class student{
	String name;
	int marks;
	
	//default 
	//student(){
	//}
		
	//no arguments 
	student(){
		System.out.println("-> no args constructor called");	
	}
	
	//parameterized constructor	
	student(String n,int a){
		name = n;
		marks = a;
	}
	
	//copy constructor
	student(student object){
		name = object.name;
		marks = object.marks;
	}
}
class Constructor{
	public static void main(String args[]){
		student obj = new student();
		student obj1 = new student("Japan",5);
		student obj2 = obj1; // copy Constructor
		student obj3 = new student(obj1); // copy Constructor
		System.out.println("-> parameterized constructor : ");
		System.out.println("the name of obj1 is : "+obj1.name);
		System.out.println("-> copy constructor : ");
		System.out.println("the name of obj2 is : "+obj2.name);
		System.out.println("the name of obj3 is : "+obj3.name);	
	}
}