package arrays;

public class FindLargest {

	public static void main(String[] args) {
		int [][]M= {
				{9,6,3},
				{23,29,30},
				{45,78,33}
		};
		
		int max = M[0][0];         //9
				
		for(int i=0;i<M.length;i++)           //i=0          i=1                   i=2
		{
			for(int j=0;j<M[i].length;j++)    //j=0,1,2      j=0,1,2            j=0,1,2
			{
				if (M[i][j] > max) {          //9>9,6>9,3>3   23>9,29>23,30>29  45>30,78>45,33>78
                    max = M[i][j];            //max           23,29,30           45    78
			}
		}
		}
			System.out.println("The largest element is: " + max);
	

}
}
