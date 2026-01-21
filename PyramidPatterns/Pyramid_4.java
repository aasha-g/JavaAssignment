package internshipAssignments_1;

public class Pyramid_4 {

	public static void main(String[] args) {
		
		int n = 5; 

        for (int r = n; r >= 1; r--) {
            
              for (int s = 1; s <= (n - r); s++) 
              {
                System.out.print("  "); 
            }
            
              for (int x = 1; x <= r; x++)
              {
                System.out.print("1 ");
            }
            
            System.out.println();
        }
    }
}
