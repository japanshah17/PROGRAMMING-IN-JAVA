class FinalVar{
  final int speedlimit=90;
  void var(){
   speedlimit=400;
   System.out.println("Speed limit is : " +speedlimit);
  }
  public static void main(String args[]){
  FinalVar obj=new  FinalVar();
  obj.var();
  }
 }
