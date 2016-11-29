package p1;

public class Swap {
	
int x,y,z;
public void showSwap()
{
	x=5;
	y=6;
	System.out.println("Before swapping "+x+" "+y);
	z=x;// both x,z contain 5
	x=y;// both x,y contain 6
	y=z; // y is assigned with the value of z
	System.out.println("After swapping "+x+" "+y);
	
}
public void secMethod()
{
	x=5;
	y=6;
	x=x+y;//x=5+6 i.e 11
	y=x-y;//y=11-6 i.e 5
	x=x-y;//x=11-5 i.e 6;
	System.out.println("After swapping  "+x+" "+y);
}
	public static void main(String[] args) {
		Swap s1= new Swap();
		//s1.showSwap();
		s1.secMethod();

	}

}








