class ProgrammingLang
{
	String type;
	String level;
	int establishYear;
	String founderName;
	double latestVersion;
	String extension;
ProgrammingLang(String type,String level,int establishYear,String founderName,double latestVersion,String extension)
{
	this.type=type;
	this.level=level;
	this.establishYear=establishYear;
	this.founderName=founderName;
	this.latestVersion=latestVersion;
	this.extension=extension;
}

public void displayProgrammingLang()
{
	System.out.println("**************************************");
	System.out.println("Type : "+this.type);
	System.out.println("level : "+this.level);
	System.out.println("establishYear : "+this.establishYear);
	System.out.println("Founder Name : "+this.founderName);
	System.out.println("Latest Version : "+this.latestVersion);
	System.out.println("Extension : "+this.extension);
}
}
class Java
{
	String [] features;
	boolean platformIndependent;
	Java(String [] features,boolean platformIndependent)
	{
		super();
		this.fetures=features;
		this.platformIndependent=platformIndependent;
	}
	public void displayJava()
	{
		System.out.println("***********************************");
	}