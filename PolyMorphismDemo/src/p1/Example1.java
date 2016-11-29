package p1;

public class Example1 {

	//Overloading is multiple functions with same name but signature
	
	//Method overloading
	
	public void calculateArea(int s)
	{
		s=s*s;
		System.out.println("Area of square is "+s);
	}
	public void calculateArea(int l,int b)
	{
		int area=l*b;
		System.out.println("Area of Rectanle is "+area);
	}
	public void calculateArea()
	{
		System.out.println("method with out parameters");
	}
	public void calculateArea(String str)
	{
		System.out.println("method with string parameter");
	}
	public static void main(String[] args) {
		Example1 ex= new Example1();
		ex.calculateArea();
		ex.calculateArea(10);
		ex.calculateArea("Sample");
		ex.calculateArea(2, 3);
	}

}
