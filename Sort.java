//Write a program to sort n numbers into ascending order using command line argument.
class Sort{
	public static void main(String [] args){
		int n = Integer.parseInt(args[0]);
		int array[]=new int[100];;
		for(int i = 0,j = 1; i < n; i++,j++){
			array[i] = Integer.parseInt(args[j]);
		}
		for(int i = 0; i < n; i++){
			for(int j = i+1; j < n; j++){
				if(array[i] > array[j]){
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		for(int i = 0; i < n; i++){
			System.out.println(array[i]);
		}
		
	}		
}
