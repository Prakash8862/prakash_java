import java.util.*;
class ArrayStoringValues
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] names=new String[5];
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Enter a Name "+(i+1)+" : ");
			names[i]=sc.next();
		}
		System.out.println(Arrays.toString(names));
	}
}