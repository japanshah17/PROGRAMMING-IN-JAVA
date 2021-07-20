class Capacity{
	public static void main(String [] args){
		StringBuffer s1=new StringBuffer();
		System.out.println("the capacity of s1 is: " +s1.capacity()); // default 16
		
		StringBuffer s2=new StringBuffer("hello");
	    System.out.println("capacity of s2: " +s2.capacity()); // 16 + length of string = 16+6 = 22
		
		s2.append(",I am Japan"); // tot. length is 11
		System.out.println("capacity of s2 : " +s2.capacity());// 22 only as less than 16 chars appended
		
		s2.append(",t shah"); // tot. length is 18
		System.out.println("capacity of s2 : " +s2.capacity());// 22*2 + 2 = 46 as more than tot. 16 chars appended
		
		s2.append(",now I have to append more"); // tot. length is 49
		System.out.println("capacity of s2 : " +s2.capacity());// 46*2 + 2 = 90 as more than tot. 46 chars appended
		
		s2.append(",now i will have to write more 41 chars to make it 182 as 90-49 =41 "); // tot. length is 117
		System.out.println("capacity of s2 : " +s2.capacity());// 90*2 + 2 = 180 as more than tot. 90 chars appended
	}
}
