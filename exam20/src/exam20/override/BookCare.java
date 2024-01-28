package exam20.override;

import exam20.upper.ComicBook;

public class BookCare {
	public static void main(String[] args) {
		
		ComicBook b = new ComicBook("트랜스포머", 30000);
		
		// default 제한자의 경우, 같은패키지 내의 클래스끼리만 접근가능,
		// BookCare 는 다른패키지의 클래스라서 접근이 안된다.
		//b.title = "33";
				
	}

}
