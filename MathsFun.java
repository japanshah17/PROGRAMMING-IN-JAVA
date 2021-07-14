import java.lang.Math;
class MathsFun{
	public static void main(String args[]){
		int a = -5;
		int b = Math.abs(a);
		System.out.println("abs of " +a +" is " +b);//returns int.. absolute value of the argument
        
		double f = 7.2;
		System.out.println("ceil of " +f +" is " +Math.ceil(f)); //returns double.. nearest lower int to argument
		
		double d = 0;  
        System.out.println("cos of " +d +" is " +Math.cos(d));  // returns cos of argument... cos0 = 1
		
		double c = 2.0;  
        System.out.println("exp of " +c +" is " +Math.exp(c));  
		
		f = 7.6;
		System.out.println("floor of " +f +" is " +Math.floor(f)); //returns double.. nearest higher int to argument
		
		c = 10;
		System.out.println("log of " +c +" is " +Math.log(c));
		
		a = 100;
		b = 200;
		int max = Math.max(a,b);
		System.out.println("max is " +max); // returns int..max of 2 numbers
		
		int min = Math.min(a,b);
		System.out.println("min is " +min); //returns int..min of 2 numbers
		
		a=2;
		b=3;
		System.out.println(a+ " raised to " +b +" is " +Math.pow(a,b)); // returns double.. a raised to b
		
		d = 90;  
        System.out.println("sin of " +d +" is " +Math.sin(d));  //returns sin of argument... sin90 = 1
		
		d = 4;
		System.out.println("sqrt of " +d +" is " +Math.sqrt(d)); //returns double..squareroot of argument.. sqrt(144) = 12

		d = 5.3584631;
		System.out.println("rint of " +d +" is " +Math.rint(d)); //returns double..closest integer to argument
	}
}