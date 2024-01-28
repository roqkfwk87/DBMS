package exam20.upper;

public class ComicBook extends Book{

	public ComicBook(String title, int price) {
	//  super(); --> 내 상위 클래스(부모)
		this.title = title;
		this.price = price;
	//	this --> 나 자신! 
		}
	
}
