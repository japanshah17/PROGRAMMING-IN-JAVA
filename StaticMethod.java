class stat{  
     static int a = 5;
	 static int b;
	 
     static void change(){  
		b = a*5;
    }  
	 
    void display(){
		System.out.println("b is " +b);
	} 
}  
public class StaticMethod{  
    public static void main(String args[]){
	stat.change();
    stat s1 = new stat();
    s1.display();  
    }  
}  