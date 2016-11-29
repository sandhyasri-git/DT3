package p1;

//Overriding is multiple functions with same name and signature. 
//It is possible between two related classes

class Example
{
	public void showMethod()
	{
		System.out.println("Method of Parent class");
	}
	public void showData1()
	{
		System.out.println("Exclusive to Parent");
	}
}
public class Example2 extends Example {
	public void showMethod()
	{
		System.out.println("Method of Child class");
	}
	public void showData()
	{
		System.out.println("Exclusive to child");
	}
	public static void main(String[] args) {
		/*Example2 ex= new Example2();
		ex.showMethod();*/
		Example ex1=new Example2();
		ex1.showMethod();
		ex1.showData1();
	}

}








