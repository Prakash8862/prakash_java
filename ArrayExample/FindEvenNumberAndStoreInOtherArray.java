import java.util.*;
class FindEvenNumberAndStoreInOtherArray
{
	public static void main(String[] args)
	{
		
	int [] arr ={1,2,3,4,5,6,7,8,9,10};
	//find the count of even number
	int count=0;
	for(int i:arr)
	{
		if(i%2==0)
			count++;

	}
	int [] evenNumber = new int[count];
	//index var to store element in evennumber array
	int indx = 0;
	//find even and store in new array
	for(int i:arr)
	{
		//check if element is even and store it by incrementing the index by 1
		if(i%2==0)
			evenNumber[indx++]=i;
	}
	System.out.println(Arrays.toString(evenNumber));
}
}