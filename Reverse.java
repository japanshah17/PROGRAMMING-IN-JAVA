import java.util.Scanner;
class Reverse{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("please enter a number : ");
		int no = input.nextInt();
		int rev = 0,n = 0,remainder = 0;
		
		while(no != 0){
			remainder = no%10;
			rev = remainder+(rev*10);
			no = no/10;
		}			
	
		System.out.print("reverse is " + rev);
	}
	
}