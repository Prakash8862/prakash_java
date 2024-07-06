class University
{
	String name;
	String universitycode;
	int noOfColleges;
	String type;
	int estYear;
	int course;
	College college1;
	University(String name,String universitycode,int noOfColleges,String type,int estYear,int course)
	{
		this.name=name;
		this.universitycode=universitycode;
		this.noOfColleges=noOfColleges;
		this.type=type;
		this.estYear=estYear;
		this.course=course;
	}
	public void displayUniversity()
	{
		System.out.println("******************************");
		System.out.println("Name : "+this.name);
		System.out.println("universitycode : "+this.universitycode);
		System.out.println("No of Colleges : "+this.noOfColleges);
		System.out.println("Type : "+this.type);
		System.out.println("Establish Year "+this.estYear);
		System.out.println("Course : "+this.course);
	}
}
class College
{
	String name;
	String collegecode;
	String address;
	int noOfDept;
	char grade;
	int staffCount;
	College(String name,String collegecode,String address,int noOfDept,char grade,int staffCount)
	{
		this.name=name;
		this.collegecode=collegecode;
		this.noOfDept=noOfDept;
		this.address=address;
		this.grade=grade;
		this.staffCount=staffCount;
	}
	public void displayCollege()
	{
		System.out.println("******************************");
		System.out.println("Name : "+this.name);
		System.out.println("College code : "+this.collegecode);
		System.out.println("Addresss : "+this.address);
		System.out.println("No Of Department : "+this.noOfDept);
		System.out.println("College Grade : "+this.grade);
		System.out.println("staffCount : "+this.staffCount);
	}
}
class Department
{
	String name;
	String hod;
	int classroom;
	int noOfStaff;
	int noOfSubjects;
	Department(String name,String hod,int classroom,int noOfStaff,int noOfSubjects)
	{
		this.name=name;
		this.hod=hod;
		this.classroom=classroom;
		this.noOfSubjects=noOfSubjects;
		this.noOfStaff=noOfStaff;
	}
	public void displayDepartment()
	{
		System.out.println(":::::::::::::::::::::::::::::::::::::;");
		System.out.println("Name of Dept : "+this.name);
		System.out.println("ClassRoom count : "+this.classroom);
		System.out.println("HOD Name : "+this.hod);
		System.out.println("No Of Staff : "+this.noOfStaff);
		System.out.println("No of Subjects : "+this.noOfSubjects);
	}
}
class Teacher
{
	String name;
	String subject;
	long phoneNo;
	String qualification;
	double exp;
	Teacher(String name,String subject,long phoneNo,String qualification,double exp)
	{
		this.name=name;
		this.subject=subject;
		this.phoneNo=phoneNo;
		this.qualification=qualification;
		this.exp=exp;
	}
	public void displayTeacher()
	{
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("Name : "+this.name);
		System.out.println("Subject :"+this.subject);
		System.out.println("Phone Num :"+this.phoneNo);
		System.out.println("qualification :"+this.qualification);
		System.out.println("Experince : "+this.exp);
	}
}
class AggregationDriver
{
	public static void main(String[] args) 
	{
		University obj = new University("VTU","VTU001",1200,"Government",1950,400);
		obj.createInstanceOfCollege("VTU College","V001","Belagavi",20,110,'A');
		obj.colloge1.displayCollege();
		obj.colloge1.createInstanceOfDepartment("MCA","Santosh Deshpande",8,8,48);
		obj.colloge1.department.displayDepartment();
		obj.college1.department.createInstanceOfTeacher("Shiav Kumar","C",9874561235l,"Phd",8.9);
	}
}