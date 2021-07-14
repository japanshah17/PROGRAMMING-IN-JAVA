//8 basic ,compile time value ,type conversion 
/*
int     Integer
char    Character
float   Float
double  Double
byte    Byte 
short   Short
long    Long
boolean boolean
*/

class Wrapper{
	public static void main(String a[]){
		int i = 5; //primitive int
		Integer iobj = new Integer(i); //object Integer
		System.out.println("int i = " +i);
		System.out.println("Integer iobj = " +iobj);
		Integer iobj1 = i; //auto boxing
		System.out.println("auto boxing iobj1 = " +iobj1);
		iobj = Integer.valueOf(i); //boxing
		System.out.println("valueOf() iobj = " +iobj);
		int j = iobj; // auto un-boxing
		System.out.println("unboxing j = " +j);
	    j = iobj.intValue(); // unboxing
		System.out.println("intValue() j = " +j);
		
		System.out.println();
		
		char s = 'J';
		Character sobj = new Character(s);
		System.out.println("char s = " +s);
		System.out.println("Character sobj = " +sobj);
		Character sobj1 = s;
		System.out.println("auto boxing sobj1 = " +sobj1);
		sobj1 = Character.valueOf(s);
		System.out.println("boxing sobj1 = " +sobj1);
		char s2 = sobj;
		System.out.println("unboxing s2 = " +s2);
	    s2 = sobj.charValue(); 
		System.out.println("charValue() j = " +s2);
		
		System.out.println();
		
		float f = 6.2f; //primitive float
		Float fobj = new Float(f); //object Float
		System.out.println("float f = " +f);
		System.out.println("Float fobj = " +fobj);
		Float fobj1 = f; //auto boxing
		System.out.println("auto boxing fobj1 = " +fobj1);
		fobj = Float.valueOf(f); //boxing
		System.out.println("valueOf() fobj = " +fobj);
		float f1 = fobj; // auto un-boxing
		System.out.println("unboxing f1 = " +f1);
	    f1 = fobj.floatValue(); // unboxing
		System.out.println("floatValue() f1 = " +f1);
		
		System.out.println();
		
		double d = 8.215; //primitive double
		Double dobj = new Double(d); //object Double
		System.out.println("double d = " +d);
		System.out.println("Double bobj = " +dobj);
		Double dobj1 = d; //auto boxing
		System.out.println("auto boxing dobj1 = " +dobj1);
		dobj = Double.valueOf(d); //boxing
		System.out.println("valueOf() dobj = " +dobj);
		double d1 = dobj; // auto un-boxing
		System.out.println("unboxing d1 = " +d1);
	    d1 = dobj.doubleValue(); // unboxing
		System.out.println("double value() d1 = " +d1);
		
		System.out.println();
		
		byte b = 100; //primitive byte
		Byte bobj = new Byte(b); //object Byte
		System.out.println("byte b = " +b);
		System.out.println("Byte bobj = " +bobj);
		Byte bobj1 = b; //auto boxing
		System.out.println("auto boxing bobj1 = " +bobj1);
		bobj = Byte.valueOf(b); //boxing
		System.out.println("valueOf() bobj = " +bobj);
		byte b1 = bobj; // auto un-boxing
		System.out.println("unboxing b1 = " +b1);
	    b1 = bobj.byteValue(); // unboxing
		System.out.println("byte value() b1 = " +b1);
		
		System.out.println();
		
		short sh = 157; //primitive short
		Short shobj = new Short(sh); //object Short
		System.out.println("short sh = " +sh);
		System.out.println("Short shobj = " +shobj);
		Short shobj1 = sh; //auto boxing
		System.out.println("auto boxing shobj1 = " +shobj1);
		shobj = Short.valueOf(sh); //boxing
		System.out.println("valueOf() shobj = " +shobj);
		short sh1 = shobj; // auto un-boxing
		System.out.println("unboxing sh1 = " +sh1);
	    sh1 = shobj.shortValue(); // unboxing
		System.out.println("short value() sh1 = " +sh1);
		
		System.out.println();
		
		long l = 10501; //primitive byte
		Long lobj = new Long(l); //object Long
		System.out.println("long l = " +l);
		System.out.println("Long lobj = " +lobj);
		Long lobj1 = l; //auto boxing
		System.out.println("auto boxing lobj1 = " +lobj1);
		lobj = Long.valueOf(l); //boxing
		System.out.println("valueOf() lobj = " +lobj);
		long l1 = lobj; // auto un-boxing
		System.out.println("unboxing l1 = " +l1);
	    l1 = lobj.longValue(); // unboxing
		System.out.println("long value() l1 = " +l1);
		
		System.out.println();
		
		boolean bo = true; //primitive boolean
		Boolean boobj = new Boolean(bo); //object Boolean
		System.out.println("boolean bo = " +bo);
		System.out.println("Boolean lobj = " +boobj);
		boolean boobj1 = bo; //auto boxing
		System.out.println("auto boxing boobj1 = " +boobj1);
		boobj = Boolean.valueOf(bo); //boxing
		System.out.println("valueOf() boobj = " +boobj);
		boolean bo1 = boobj; // auto un-boxing
		System.out.println("unboxing bo1 = " +bo1);
	    bo1 = boobj.booleanValue(); // unboxing
		System.out.println("long value() bo1 = " +bo1);
		
		
		//type conversion:
		System.out.println();
		int z = 5;
		String y = "75";
		int yint = Integer.parseInt(y);
		System.out.println("yint is : " +yint);
	}
}
