class  
{
	String brand;
	String pageColour;
	Book(String brand,String pageColour)
	{
		this.brand=brand;
		this.pageColour=pageColour;
	}
	void displayBook()
	{
		System.out.println("****BOOK****");
		System.out.println("Book Brand : "+this.brand);
		System.out.println("Page Colour :"+this.pageColour);
	}
}
class Notebook extends Book
{
	String type;
	int price;
	int size;
	Notebook(String type,int price,int size,String brand,String pageColour)
	{
		super(brand,pageColour);
		this.type=type;
		this.price=price;
		this.size=size;
	}
	void dispalyNotebook()
	{
		System.out.println("***NOTEBOOk***");
		System.out.println("Note book Type : "+this.type);
		System.out.println("NoteBook Price :"+this.price);
		System.out.println("NoteBook Size :"+this.size +"inch");
	}
}
class TextBook extends Book
{
	String author;
	String publisher;
	int priceT;
	TextBook(String author, String publisher,int priceT,String brand,String pageColour)
	{
		super(brand,pageColour);
		this.author=author;
		this.publisher=publisher;
		this.priceT=priceT;
	}
	void displayTextBook()
	{
		System.out.println("***TEXTBOOK***");
		System.out.println("Text Book Publisher : "+this.publisher);
		System.out.println("Author of TextBook :"+this.author);
		System.out.println("Price of TextBook : "+this.priceT);
	}
}
class PictureBook extends Book
{
	String category;
	int priceP;
	int noOfPictures;
	PictureBook(String category,int priceP,int noOfPictures,String brand,String pageColour)
	{
		super(brand,pageColour);
		this.category=category;
		this.priceP=priceP;
		this.noOfPictures=noOfPictures;
	}
	void dispalyPictureBook()
	{
		System.out.println("***PictureBook***");
		System.out.println("Type Of Pictures/Category : "+this.category);
		System.out.println("Price of PictureBook"+this.priceP);
		System.out.println("Number OF Pictures : "+this.noOfPictures);
	}
}
class HerirchicalInheritEx
{
	public static void main(String[] args)  
	{
	  PictureBook obj1=new PictureBook("Animal",200,50,"ClassMate","White");
	  TextBook obj2 =new TextBook("ABC","XYZ",200,"ClassMate","White");
	  Notebook obj3=new Notebook("Ruled",30,28,"ClassMate","White");
	  obj1.displayBook();
	  obj1.dispalyPictureBook();
	  obj2.displayBook();
	  obj2.displayTextBook();
	  obj3.displayBook();	
	  obj3.dispalyNotebook();

	}
}