import java.util.Scanner;
class Max{
	
	public static void main(String args[]){
		Scanner myobj = new Scanner(System.in);
		
		System.out.println(" Enter a ");
		int a = myobj.nextInt();
		
		System.out.println(" Enter b ");
		int b = myobj.nextInt();
		
		System.out.println(" Enter c ");
		int c = myobj.nextInt();
		
		int result;
		if(a>b && a>c){
			result = a;
		}
		else if(b>a && b>c){
			result = b;
		}
		else {
			result = c;
		}
		
		//result = (a>b)?(a>c?a:c):(b>c?b:c);
		System.out.println(result + " is maximum");
	}
}