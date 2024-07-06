abstract class ArithMatic
{
	abstract void add(int num1,int num2);
	abstract void sub(int num1,int num2);
	abstract void mul(int num1,int num2);
	abstract void div(int num1,int num2);
	abstract void modulus(int num1,int num2);

}
class Implementation extends ArithMatic
{
	void add(int num1,int num2)
	{
		System.out.println("Addition : "+(num1+num2));
	}
	void sub(int num1,int num2)
	{
		System.out.println("Substarction : "+(num1-num2));
	}
	void mul(int num1,int num2)
	{
		System.out.println("Multiplication : "+(num1*num2));
	}
	void div(int num1,int num2)
	{
		System.out.println("Division : "+(num1/num2));
	}
	void modulus(int num1,int num2)
	{
		System.out.println("Modulus : "+(num1%num2));
	}

}
class AbstractEx
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=20;
		Implementation obj = new Implementation();
		obj.add(num1,num2);
		obj.sub(num1,num2);
		obj.mul(num1,num2);
		obj.div(num1,num2);
		obj.modulus(num1,num2);	
	}
}