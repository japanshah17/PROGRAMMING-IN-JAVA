class Person{  
  final void name(){
	System.out.println("Japan");
  }  
}  
    
class Man extends Person{  
  void name(){
	System.out.println("Shah Japan");
  }   
}

class FinalMethod{
    public static void main(String args[]){  
		Person obj= new Person();  
		obj.name();  
   }  
}	