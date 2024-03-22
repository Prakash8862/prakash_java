import java.util.Scanner;
class WhileLengthAndPower
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int length=0;
		int dup=num;
		int power=1;
		while(num!=0)
		{
			length++;
			num/=10;
		}
		for(int i=1;i<=length;i++)
		{
			power*=dup;
		}
		System.out.println("The power of entered number : (The power is lengthof that"+power);
	}
}