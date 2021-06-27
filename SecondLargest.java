import java.util.Scanner;

public class SecondLargest{
	public static void main(String[] args){
		int high=0,sec_high=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n more than 2 : ");
		int n = in.nextInt();
		System.out.print("Enter the Number 1 : ");
		int value = in.nextInt();
		high = value;
		System.out.print("Enter the Number 2 : ");
		value = in.nextInt();
		
		if(value>high){
			sec_high=high;
			high=value;
		}
		else{
				sec_high=value;
		}
				for(int i=3;i<=n;i++){
			System.out.print("Enter the Number "+i+" : ");
			value = in.nextInt();
			if(value>high){
				sec_high=high;
				high=value;
			}
			else{
				if(value>sec_high){
					sec_high=value;
				}
			}
		}
	System.out.println("Highest value:" + high);
	System.out.println("Second Highest value:" + sec_high);
	}
}