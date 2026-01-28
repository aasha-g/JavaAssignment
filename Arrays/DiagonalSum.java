package arrays;

public class DiagonalSum {

	public static void main(String[] args) {
		
		int[][]M = {
				{1,1,2},         //(0,0) (0,1) (0,2)
				{2,3,4},         //(1,0) (1,1) (1,2)
				{5,6,7}          //(2,0) (2,1) (2,2)
		};
		
		int n = M.length;
		int p1 = 0;
		int s1 = 0;
		
		for(int i=0;i<n;i++)                 //i=0     1        2
		{
			p1+=M[i][i];        //p1+M[i][i]   (0,0)  (1,1)    (2,2)--->1+3+7
			s1+=M[i][n-1-i];    //s1+M         (0,2)  (1,1)    (2,0)---->2+3+5
		}
		
		System.out.println("Primary Diagonal Sum: " + p1);
        System.out.println("Secondary Diagonal Sum: " + s1);
	}

}

