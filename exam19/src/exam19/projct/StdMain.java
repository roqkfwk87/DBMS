package exam19.projct;

public class StdMain {

	public static void main(String[] args) {
		
		StdService service = new StdService();
		
		//학생생성;
		service.createStudent();
		//출력
		service.printStudent();
		
		
	}

}
