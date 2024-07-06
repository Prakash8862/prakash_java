class Parent
{
	String str="Hi From Static Class";
	void m1()
	{
		System.out.println("Hello From m1()");
	}
	static void m3()
	{
		System.out.println("Hello From m3() Static Parent");
	}
}
class Child extends Parent
{
	String str2="Hi from Parent";
	void m2()
	{
		System.out.println("Hello from child class m2()");
	}
	static void m4()
	{
		System.out.println("Hello from m4() Static child");
	}
}
class InherDriver
{
	public static void main(String[] args) 
	{
		
			Child obj=new Child();
			obj.m2();
			obj.m3();
			obj.m4();
	}
}