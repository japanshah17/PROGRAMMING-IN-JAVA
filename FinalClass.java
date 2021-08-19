final class Person{  
  void name(){
	System.out.println("Japan");
  }  
}  
    
class Man extends Person{  
  void names(){
	System.out.println("Shah Japan");
  }   
}

class FinalClass{
    public static void main(String args[]){  
		Person obj= new Person();  
		obj.name();  
   }  
}	