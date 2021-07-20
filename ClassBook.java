import java.util.Scanner;
class Book{
	String name;
	String author;
	int price;
	Book(String n,String a,int p){
		name = n;
		author = a;
		price = p;
		
	}
}
class ClassBook{
	public static void main(String args[]){
		Book obj = new Book("japaaaan","assa",5);
		System.out.println("the name of book is : "+obj.name);
	}
}