class Car
{
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine;

	Car(String brand,String model,String type,double price,int seatingCapacity,double horsePower,double capacityInLiter,String engineType,double milege,int numberOfPiston)
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.seatingCapacity=seatingCapacity;
		this.engine=new Engine(horsePower,capacityInLiter,engineType,milege,numberOfPiston);

	}
	public void displayCar()
	{
		System.out.println("Brand :"+this.brand);
		System.out.println("Type : "+this.type);
		System.out.println("Model :"+this.model);
		System.out.println("Price :"+this.price);
		System.out.println("seatingCapacity :"+this.seatingCapacity);
	}
}
class Engine
{
	double horsePower;
	double capacityInLiter;
	String engineType;
	double milege;
	int numberOfPiston;
	Engine(double horsePower,double capacityInLiter,String engineType,double milege,int numberOfPiston)
	{
		this.horsePower=horsePower;
		this.capacityInLiter=capacityInLiter;
		this.engineType=engineType;
		this.milege=milege;
		this.numberOfPiston=numberOfPiston;
	}
	public void displayEngine()
	{
		System.out.println("Horse Power : "+this.horsePower);
		System.out.println("Capacity In Liter : "+this.capacityInLiter);
		System.out.println("Engine Type : "+this.engineType);
		System.out.println("Milege : "+this.milege);
		System.out.println("Number of Piston : "+this.numberOfPiston);
	}
}
class CarDriver
{
	public static void main(String[] args)
	{
		Car obj = new Car("Tata","Punch","Prtrol",1500000,4,120,1.2,"SUV",14,4);
		obj.displayCar();
		obj.engine.displayEngine();
		
	}
}