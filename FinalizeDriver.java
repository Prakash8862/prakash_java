class Employee
{
	String name;
	int age;
	Employee(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	protected void finalize() throws Throwable
	{
		try{
			System.out.println("Finale Method called");
		}
		finally{
			super.finalize();
		}
	}
}
class FinalizeDriver 
{
	public static void main(String[] args) 
	{
		Employee obj = new Employee("RRR",20);
		obj=null;
		System.gc();
		try{
			Thread.sleep(1000);
		}	
		catch(InterruptedException e){
			e.printStackTrace();

		}
	}
}