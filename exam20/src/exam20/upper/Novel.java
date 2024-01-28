package exam20.upper;

public class Novel extends Book2 {
	
	public Novel(String title, int price) {
		//부모클래스의 생성자가 파라메터(매개변수)가 없는
		// 기본생성자가 아닐 경우에, 시스템이 자동으로 부모클래스의
		// 생성자를 만들수 없기 때문에, 개발자가 직접 호출해야한다.
		super(title, price);
	}

}
