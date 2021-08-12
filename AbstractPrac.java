import java.util.Scanner;
abstract class Shape{
	abstract void area();
	Scanner sc = new Scanner(System.in);
}

class Triangle extends Shape{
	
	void area(){
		System.out.println("-----Triangle-----");
		System.out.print("Enter height : ");
		int h = sc.nextInt();
		System.out.print("Enter base : ");
		int b = sc.nextInt();
		int a = (h*b)/2;
		System.out.println("The area of Triangle is : " +a);
	}
}
class Rectangle extends Shape{
	void area(){
		System.out.println("-----Rectangle-----");
		System.out.print("Enter height : ");
		int h = sc.nextInt();
		System.out.print("Enter width : ");
		int w = sc.nextInt();
		int a = h*w;
		System.out.println("The area of Rectangle is : " +a);
	}
}
class Circle extends Shape{
	void area(){
		System.out.println("-----Circle-----");
		System.out.print("Enter radius : ");
		int r = sc.nextInt();
		float a = 3.14f*r*r;
		System.out.println("The area of Circle is : " +a);
	}
}

class AbstractPrac{
	public static void main(String [] args){
		Triangle obj = new Triangle();
		obj.area();
		Rectangle obj1 = new Rectangle();
		obj1.area();
		Circle obj2 = new Circle();
		obj2.area();
	}
	
}