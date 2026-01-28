package arrays;

public class ArrayMaxAndMin {

	public static void main(String[] args) {
		int[]Array1 = {42,78,51,12,99};
		
		int max = Array1[0];
		int min = Array1[0];
		
		for(int i=1;i<Array1.length;i++)
		{
			if(Array1[i]>max) {			
				max=Array1[i];
			}else if(Array1[i]<min) {
				min=Array1[i];
		    }
		}
		  System.out.println("Maximum Element: " + max);
          System.out.println("Minimum Element: " + min);
	}

}

