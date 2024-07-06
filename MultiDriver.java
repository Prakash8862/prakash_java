class Humans
{
	String name;
	String gender;
	Humans(String name,String gender)
	{
		super();
		this.name=name;
		this.gender=gender;
	}
	void eat()
	{
		System.out.println("Human can eat");
	}
	void walk()
	{
		System.out.println("Human can walk");
	}
	void think()
	{
		System.out.println("Human can Think");
	}
	void speak()
	{
		System.out.println("Human csn speak");
	}
	void displayHumans()
	{
		System.out.println("NAME :"+this.name);
		System.out.println("Gender : "+this.gender);
	}
}
class Graduation extends Humans
{
	String course;
	int duration;
	String branch;
	String university;
	int yop;
	Graduation(String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(name,gender);
		this.course=course;
		this.duration=duration;
		this.branch=branch;
		this.university=university;
		this.yop=yop;
	}
	void displayGraduation()
	{
		System.out.println("************Graduation***************");
		System.out.println("Course :"+this.course);
		System.out.println("Duartion :"+this.duration);
		System.out.println("Branch : "+this.branch);
		System.out.println("university : "+this.university);
		System.out.println("YOP : "+this.yop);
	}
}
class PostGraduation extends Graduation
{
	String special;
	int durationPg;
	int yopPg;
	String universityPg;
	PostGraduation(String special,int durationPg,int yopPg,String universityPg,String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(course,duration,branch,university,yop,name,gender);
		this.special=special;
		this.durationPg=durationPg;
		this.yopPg=yopPg;
		this.universityPg=universityPg;
	}
	void displayPostGraduation()
	{
		System.out.println("*****PostGraduation*****");
		System.out.println("Specialization : "+this.special);
		System.out.println("Duration for Pg :"+this.durationPg);
		System.out.println("Year Of PAssing of Pg :"+this.yopPg);
		System.out.println("university Of PostGraduation : "+this.universityPg);
	}
}
class Job extends PostGraduation
{
	String company;
	int salary;
	String designation;
	String location;
	Job(String company,int salary,String designation,String location,String special,int durationPg,int yopPg,String universityPg,String course,int duration,String branch,String university,int yop,String name,String gender)
	{
		super(special,durationPg,yopPg,universityPg,course,duration,branch,university,yop,name,gender);
		this.company=company;
		this.salary=salary;
		this.designation=designation;
		this.location=location;
	}
	void displayJob()
	{
		System.out.println("**********JOB*************");
		System.out.println("Company :"+this.company);
		System.out.println("Salary : "+this.salary);
		System.out.println("designation : "+this.designation);
		System.out.println("Loaction : "+this.location);
	}
}
class MultiDriver
{
	public static void main(String[] args)
	{
		Job obj = new Job("TCS",700000,"Ast.Software Engineer","PUNE","JAVA",2,2023,"VTU","Engineering",4,"CSE","VTU",2021,"Ramaesh","Male");
		obj.displayHumans();
		obj.displayGraduation();
		obj.displayPostGraduation();
		obj.displayJob();
	}
}