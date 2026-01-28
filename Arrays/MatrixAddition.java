package arrays;

public class MatrixAddition {

	public static void main(String[] args) {
		int[][] a = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        int[][] b = {
	            {7, 8, 9},
	            {1, 2, 3}
	        };

	        int rows = a.length;               //2
	        int cols = a[0].length;            //3

	        int[][] sum = new int[rows][cols]; 

	        
	        for (int i = 0; i < rows; i++) {       //i=0     i=1
	            for (int j = 0; j < cols; j++) {    //1+7    4+1
	                sum[i][j] = a[i][j] + b[i][j];  //2+8    5+2
	            }                                   //3+9    6+3
	        }

	       
	        System.out.println("Resultant Matrix:");
	        for (int i = 0; i < rows; i++) {            
	            for (int j = 0; j < cols; j++) {        
	                System.out.print(sum[i][j] + " ");  //sum[0][0]=1+7 sum[0][1]=2+8 sum[0][2]=3+9
	            }                                       //
	            System.out.println();                   
	        }
	    }
	}
