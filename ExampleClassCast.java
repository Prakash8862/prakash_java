class Example
{
	void m1()
	{
		System.out.println("Hello");
	}
}
class Example1 extends Example
{
	void m2()
	{
		System.out.println("Hiii");
	}
}
class ExampleClassCast
{
	public static void main(String[] args) 
	{
		System.out.println("Main Method Starts");
		Example e = new Example();
		//e.m1();
		try
		{
			Example1 e1=(Example1)e;
		}
		catch(Exception ew)
		{
			ew.printStackTrace();
		}
		System.out.println("Main Method Ends");

	}
}