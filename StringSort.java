import java.util.Arrays;
  
public class StringSort 
{
    public static void main(String[] args)
    {
        String[] input = {"Banana" ,"Apple", "Orange", "Grapes"}; 
        int n = input.length;		
        for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				int compare = input[i].compareToIgnoreCase(input[j]);
				if(compare > 0){
					String temp;
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(input[i]);
		}
    }
}
