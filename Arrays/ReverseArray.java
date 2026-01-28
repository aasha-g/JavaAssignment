package arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		int Array1[]= {1,2,3,4,5,6,7};
		int a = Array1.length;
		if(a%2==0) {
			System.out.println("Array length is even");
		}else {
			System.out.println("Array length is odd");
		}
		
		for(int p1=0;p1<=a/2;p1++) {
			//p1+p2=4;
			//0+4=4
			//1+3=4
			int S =Array1[p1];
			Array1[p1]=Array1[(a-1)-p1];
			Array1[(a-1)-p1]=S;
			//a=10;
			//System.out.println(a);
		}
		for(int i=0;i<=(a-1);i++)
		{
		System.out.println(Array1[i]);
	}

}
}
