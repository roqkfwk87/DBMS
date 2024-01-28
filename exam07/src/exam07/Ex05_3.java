package exam07;

public class Ex05_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int gugu = 2; gugu < 10; gugu++) {
			
			//구구단 출력
			for(int dan = 1; dan <=9; dan++) {
				System.out.print(gugu + "X" + dan + "=" + (gugu * dan)+ "\t");
			}
			
			//내용이 없는 print() 메서드 사용 -> 줄 바꿈
		   System.out.println();
		
		
		
		}
	}

}
