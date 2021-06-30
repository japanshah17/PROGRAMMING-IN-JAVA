import java.util.Scanner;
class MatrixMul{
	public static void main(String [] args){
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){
				System.out.print("Enter value for a " + (i+1) + " " + (j+1) + " : ");
				a[i][j] = input.nextInt();
				}
			}
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){
				System.out.print("Enter value for b " + (i+1) + " " + (j+1) + " : ");
				b[i][j] = input.nextInt();
				}
			}
		
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=0;      
				for(int k=0;k<3;k++){      
					c[i][j] = c[i][j]+a[i][k]*b[k][j];      
				}
				System.out.print(c[i][j]+" "); 
			}
			System.out.println();
		}
	}
}	