
package oopsPolymorphism;

public class Rectangle {
    
	int length,width;
	
	Rectangle()
	{
		length=4;
		width=5;
	}
	
	Rectangle(int l,int w)
	{
		length=l;
		width=w;
	}
	
	int Area()
	{
		return(length*width);
	}
}
