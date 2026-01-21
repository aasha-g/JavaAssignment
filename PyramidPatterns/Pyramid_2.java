package internshipAssignments_1;

public class Pyramid_2 {

	public static void main(String[] args) {
		
		int nos = 8;
		
		for(int r=1;r<=5;r++)         //r=1                r=2
	   {
		for(int s=1;s<=nos;s++)      // s=8 spaces         s=6
		{
			System.out.print(" ");
		}
		for(int x=1;x<=r;x++)        //x=1                 x=1 1
			
			System.out.print(" 1");  
			
		    nos=nos-2;               //nos=6               4
		    
		    System.out.println();    //next line
	}

}
}
