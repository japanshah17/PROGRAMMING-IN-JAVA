import java.util.Scanner;

class year{
	boolean leap(int y){
		if(y%4 == 0){
			return true;
		}
		else{
			return false;
		}
	}
}
class LeapYear extends year{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year : ");
		int a = sc.nextInt();
		LeapYear obj = new LeapYear();
		boolean res = obj.leap(a);
		if(res == true){
			System.out.println("It is a leap year");
		}
		else{
			System.out.println("It is not a leap year");
		}	
	}
}