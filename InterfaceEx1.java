interface Arithmatic
{
	int add(int a,int b);
	int multi(int a,int b);

}
class Implementation implements Arithmatic
{
	public int add(int a,int b)
	{
		return (a+b);
	}

	public int multi(int a,int b)
	{
		return(a*b);
	}
}
class InterfaceEx1
{
	public static void main(String[] args)	
	{
		Implementation obj=new Implementation();
		System.out.println("Addition : "+obj.add(10,20));
		System.out.println("Multiplication : "+obj.multi(10,20));


	}
}
