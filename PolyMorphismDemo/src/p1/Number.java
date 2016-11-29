package p1;

public class Number {
	
	int x,y;
	public void checkNumber()
	{
		x=10;
		y=3;
		if(x%y==0)
		{
			System.out.println("First number is completely divisible by second");
		}
		else
		{
			System.out.println("First is not divisible by sec");
		}
	}
	public void reverseNumber(int num)
	{
		int rev=0;
		while(num!=0)
		{
			rev=(rev*10)+(num%10 );
			num=num/10;
		}
		System.out.println("Reversed number is "+rev);
	}
	
	public static void main(String[] args) {
		Number n1 = new Number();
		//n1.checkNumber();
		n1.reverseNumber(17837);
		

	}

}
