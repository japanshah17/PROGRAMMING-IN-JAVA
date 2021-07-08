//Write a program which  reads String from user and compares strings using equals() ,equalsIgnoreCase( ) ,compareTo() method.

import java.util.Scanner;
class StringCompare{
	public static void main(String [] args){
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter string1: ");
		String s1= sc.nextLine();
		System.out.print("Enter string2: ");
		String s2= sc.nextLine();
		
		System.out.println("equals method : " +s1.equals(s2));
		System.out.println("equalsIgnoreCase method : " +s1.equalsIgnoreCase(s2));
		System.out.println("compareTo() method : " +s1.compareTo(s2));
		System.out.println("compareToIgnoreCase() method : " +s1.compareToIgnoreCase(s2));
	}

}