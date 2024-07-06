class Fibonacci
{
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2+" ");
		for (int i=1;i<=8;i++) {
			int op=num1+num2;
			System.out.print(op+" ");
			num1=num2;
			num2=op;
			
		}
	}
}