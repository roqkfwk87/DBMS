package exam04;

import java.util.Scanner;

public class ifTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 키보드로부터 입력되는 값을 기다렸다가 들어오면 가져온다.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이를 입력 : ");
		int age = scan.nextInt(); // 정수값 입력 대기
		
		if (age > 19) {
			System.out.println("성인입니다.");
			}else {
				System.out.println("미성년자입니다.");
			}
		// 스캐너 사용 후 닫아줘야한다.
		scan.close();
		
	}

}
