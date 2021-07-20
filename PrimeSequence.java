import java.util.Scanner;
class PrimeSequence
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter Amount of Prime numbers.. ");
		int no=scan.nextInt();
		int i,m=2;
		
		for(;no>0;no--){
			for(i=2;i<m;i++){
				if(m%i==0){
					break;
				}
				else{
					System.out.println(m+" , ");
				}
			}
			m = m++;
		}
	}
}
