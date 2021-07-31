import java.util.Scanner;
class Book{
	String name;
	String author;
	int price;
		Book(){
		
		}
	Book(String n,String a,int p){
		name = n;
		author = a;
		price = p;
	}

}
class ClassBook{
	public static void main(String args[]){
		Book bobj = new Book();
		Book obj = new Book("japaaaan","assa",5);
		Book bobj1 = bobj;
		bobj.name = "Japan";
		
		
		System.out.println("the name of book in bobj is : "+bobj.name);	
		System.out.println("the name of book in obj is : "+obj.name);
		System.out.println("the name of book in bobj1 is : "+bobj1.name);	
	}
}