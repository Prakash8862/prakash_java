//Clone Object method Example
class Human implements Cloneable
{
	String name;
	String place;
	String gender;
	String profossion;
	Human(String name,String place,String gender,String profossion)
	{
		this.name=name;
		this.place=place;
		this.gender=gender;
		this.profossion=profossion;
	}
	public String toString()
	{
		return this.name+ ","+this.place+" "+this.gender+" "+this.profossion;
	}
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
class ObjectClass1
{
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Human obj=new Human("AKASH","Pune","MALE","Student");
		System.out.println(obj);

		Human obj1=(Human)obj.clone();
		System.out.println(obj1);
		
	}
}