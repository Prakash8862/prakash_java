abstract class Parent
{
	abstract void m1();
	abstract void m2();
	void m3()
	{
		System.out.println("Parent M3");
	}

}
abstract class Child1 extends Parent
{
	void m2()
	{
		System.out.println(" M2 implemented in child1");
	}
	abstract void m4();

}
class SubChild extends Child1
{
	void m1()
	{
		System.out.println("M1 implemented in subChild1");
	}

	void m4()
	{
		System.out.println("M4 implemented in subChild1");
	}
}
class Child2 extends Parent
{
	void m1()
	{
		System.out.println("M1 implemented in Child2");
	}
	void m2()
	{
		System.out.println(" M2 implemented in child2");
	}
	void m5()
	{
		System.out.println("Child2's M5()");
	}
}
class AbstractEx1
{
	public static void main(String[] args) {
		SubChild obj=new SubChild();
		Child2 obj1 = new Child2();
		obj.m1();
		obj.m4();
		obj1.m1();
		obj1.m2();
		obj1.m5();
		obj1.m3();
		obj.m2();





	}
}