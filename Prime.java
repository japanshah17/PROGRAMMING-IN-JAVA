class Prime{
	public static void main (String[] args){
		int number = Integer.parseInt(args[0]);
		int flag = 0;
		for(int i = 2; i < number-1; i++){
			if(number%i == 0 ){
				flag = 1;
			}
		}
		if(flag == 1){
			System.out.println(number + " is not prime");
		}
		else{
			System.out.println(number + " is prime");
		}
	}
}
