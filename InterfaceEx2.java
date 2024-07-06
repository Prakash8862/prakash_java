interface Parent1
{
	void m1();
}
interface Parent2
{
	void m2();
}
interface Child extends Parent1,Parent2
{
	void m3();
}
class Implementation implements Child
{
	public void m1()
	{
		System.out.println("Hello From M1 ");
	}
	public void m2()
	{
		System.out.println("Hello From M2 ");
	}
	public void m3()
	{
		System.out.println("Hello From M3 ");
	}
}
class InterfaceEx2 
{
	public static void main(String[] args) 
	{
		Implementation obj = new Implementation();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}