/* Write a program which reads 2 String from user and perform following operation:

1.            Find string length

2.            Convert one string into uppercase

3.            Convert one string in lower case

4.            Concate  string using method

5.            Find string length of new concated string

6.            Use valueOf() method

7.            Find substring from given string

8.            Use indexOf( ) method

9.            Use replace( ) method

10.          Use charAt( ) method

11.          Reverse String

12.          Use append() method

13.          Use setCharAt( ) method

Write a program which  reads String from user and compares strings using equals() ,equalsIgnoreCase( ) ,compareTo() method.
*/

import java.util.Scanner;
class StringDemo{
	public static void main(String args[]){
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string1: ");
		String s1= sc.nextLine();
		System.out.print("Enter string2: ");
		String s2= sc.nextLine();
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		System.out.println("length of string 1 is "+len1); // length of string 1
		System.out.println("length of string 2 "+len2); // length of string 2
		
		s1 = s1.toUpperCase();
		System.out.println("Uppercase string 1 "+s1); // change string 1 to uppercase
		
		s2 = s2.toLowerCase();
		System.out.println("Lowercase string 2 "+s2); // change string 2 to lowercase
		
		
		//s1 = s1+s2;
		//System.out.println("concated is : " +s1);
		//System.out.println("concated is : " +s1+s2);
		//System.out.println("concated is : " +s1.concat(s2));
		s1 = s1.concat(s2);
		System.out.println("concated string is : " +s1);
		
		int lenc = s1.length();
		System.out.println("length of concated string is : " +lenc);
		
		String s3 = s1.valueOf('a');
		System.out.println("value of a is: " +s3);
		
		String sub1 = s1.substring(1,4);//APA
		System.out.println("Sub string of s1 from index 1 to 4 is: " +sub1);
		
		int index = s1.indexOf('P');
		System.out.println("Index of p is : "+index);
		
		String replace = s1.replace("shah"," SHAH");
		System.out.println(s1 +" changed to " +replace);
		
		s1 = "JAPAN";
		StringBuilder sb=new StringBuilder(s1);
		
		char charat = s1.charAt(2);
		System.out.println("character at 2 is " +charat);
		
		System.out.println(sb.reverse());  
		
		s1 = "JAPAN";
		StringBuilder sb2=new StringBuilder(s1);
		
		sb2.append(" hey");
		System.out.println("apended is : " +sb2);
		
		sb2.setCharAt(2,'p');
		System.out.println("setCharAt : " +sb2);
		
		
	}
}

