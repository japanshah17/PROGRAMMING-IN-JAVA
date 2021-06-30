import java.util.Scanner;
class NumberToWord{
	public static void main(String [] args){
		String one[] = { "", " One", " Two", " Three", " Four", " Five", " Six", " Seven", " Eight", " Nine", " Ten"," Eleven", " Twelve", " Thirteen", " Fourteen", "Fifteen", " Sixteen", " Seventeen", " Eighteen"," Nineteen" };
 		String ten[] = { "", "", " Twenty", " Thirty", " Forty", " Fifty", " Sixty", "Seventy", " Eighty", " Ninety" };

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		
		if (n > 99){
			if(n%100 > 19){
				System.out.print(one[n / 100]  + " " + "Hundred ");
				n = n%100;
				System.out.print(ten[n / 10] + " " + one[n % 10]);
			}
			else{	
			System.out.print(one[n / 100] + " " + "Hundred " + one[n % 100]);
			}
		}		
		else if (n > 19 && n < 99){
			System.out.print(ten[n / 10] + " " + one[n % 10]);
		}
		else{
			System.out.print(one[n]);
		}
	}
}