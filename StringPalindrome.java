import java.util.Scanner;
class StringPalindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s1 = sc.nextLine();
		
		StringBuilder sb=new StringBuilder(s1);  
		sb.reverse();  
		String rev=sb.toString();  
		
		if(s1.equals(rev)){  
			System.out.println("pallindrome");
		}
		else{
			System.out.println("not pallindrome");
		}
	}
}