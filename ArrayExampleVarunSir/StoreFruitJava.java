import java.util.*;
class StoreFruitJava
{
	String fruits[];
	static Scanner sc=new Scanner(System.in);
	public void storeFruits(String fruits[])
	{
		this.fruits=fruits;
		for(int i=0;i<fruits.length;i++)
		{
			fruits[i]=sc.next();
		}
	}
	public void displayFruits()
	{
		System.out.println(Arrays.toString(fruits));
	}
	public void changeFruit()
	{
		System.out.println("Eneter a Fruit");
		String inputFruit=sc.next();

		for(int i=0;i<fruits.length;i++)
		{
			if(inputFruit.equals(fruits[i]))
			{
				System.out.println("Enter a new fruit to upadate : ");
				String newFruit=sc.next();
				break;

			}
		}
	}
	public static void main(String[] args) 
	{
		StoreFruitJava f=new StoreFruitJava();

		System.out.println("*********Welcome to Fruit Store*************");
		System.out.println("1.Store Fruits. 2.Display Fruits. 3.Change Fruit 4.Close Fruit Store");
		System.out.println("Choose a option What you want to do :::::::");
		int opt=sc.nextInt();
		boolean exit=true;
		while(exit)
		{
			switch(opt)
			{
			case 1:
				{
					System.out.println("Enter a Size : ");
					int size=sc.nextInt();
					String[] fruits=new String[size];
					System.out.println("Enter a Fruits : ");
					//StoreFruitJava f=new StoreFruitJava();
					f.storeFruits(fruits);
					break;

				}
			case 2:
				{
					//StoreFruitJava f=new StoreFruitJava();
					f.displayFruits();
				}
			case 3:
				{
					//StoreFruitJava f=new StoreFruitJava();
					f.changeFruit();	
				}
			case 4:
				{
					System.exit(0);
				}
			}
		}

		
		
	}
}