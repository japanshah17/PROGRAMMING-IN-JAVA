import java.util.Scanner;

public class SecondLargestTwo{
	public static void main(String[] args){
		int high=0,sec_high=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the value of n more than 2 : ");
		int n = in.nextInt();
		int value;
		
		for(int i=0;i<n;i++){
			System.out.print("Enter the Number "+(i+1)+" : ");
			value = in.nextInt();
			if(i == 0){
				high = value;
			}
			else{
				if(sec_high == 0){
					sec_high = value;
				}
				if(value>high){
				sec_high=high;
				high=value;
				}
				else if(value>sec_high){
					sec_high=value;
				}
			}
		}
	System.out.println("Highest value:" + high);
	System.out.println("Second Highest value:" + sec_high);
	}
}