package p1;

public class Fibonacci {

	int x,y,z=0;
	public void showSeries()
	{
		x=0;
		y=1;
		System.out.print(x+" "+y);
		while(z<10)
		{
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
		}
		
	}
	public static void main(String[] args) {
		Fibonacci f1= new Fibonacci();
		f1.showSeries();

	}

}
