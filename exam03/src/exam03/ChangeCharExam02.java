package exam03;

public class ChangeCharExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch ='E';
		int num = 120;
		
		int chToNum = 0;
		char intToCh = ' ';
		
		//int 와 char는 자동형변환
		//char --> int 로 변경할때는 자동형변환 가능
		chToNum = ch;
		//int --> char 변경할 때는 강제형변환
		intToCh = (char)num;

		System.out.println(chToNum);
		System.out.println(intToCh);
		
	}

}
