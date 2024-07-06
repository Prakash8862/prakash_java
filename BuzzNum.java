//A number which dived by 7 or number have a Last number 7 is Called as Buzz Nuber
import java.util.*;
class BuzzNum
{
	public static void main(String[] args) {
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Eneter a number : ");
			int num=sc.nextInt();
			if((num%7==0) || (num%10==7))
			{
				System.out.println("It is A BuzzNum");
			}
			else{
				System.out.println("It is Not a BuzzNum");
			}
		}
	}
}