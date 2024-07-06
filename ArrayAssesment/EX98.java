import java.util.*;
class EX98
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num chapter : ");
		int num=sc.nextInt();
		System.out.println("Enter a Starting day : ");
		int sday=sc.nextInt();
		System.out.println("Enter a Ending day : ");
		int eday=sc.nextInt();
		int[] numChapterClass=new int[eday];
		int indx=0;
		for(int i=0;i<num;i++)
		{
			numChapterClass[indx++]=i;
			// if(numChapterClass[i]>=sday && numChapterClass[i]<eday)
			// {
			// 	for(int j=0;j<numChapterClass[i];j++)
			// 		System.out.print(i);
			// }
		}
	}
}