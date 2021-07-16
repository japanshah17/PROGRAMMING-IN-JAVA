import java.util.Scanner;
class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s1 = sc.nextLine();
		int i = 0, j = s1.length() - 1;
		int flag = 0;
 
        while (i < j){
 
            if (s1.charAt(i) != s1.charAt(j)){
                flag = 1;
				break;
			}	
            i++;
            j--;
        }
		if(flag == 0){
			System.out.println("pallindrome");
		}
		else{
			System.out.println("not pallindrome");
		}
	}
}