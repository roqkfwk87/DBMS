package exam05;

public class SwitchExam01 {
	public static void main(String[] args) {
		
		int score = 0;
		
		score = (int)(Math.random() * 100 ) + 1;
		
		switch(100 / 10) {	
		case 10 :
		case 9 :
			System.out.println("점수 : " + score + ", 학점 : A학점");
		case 8 :
			System.out.println("점수 : " + score + ", 학점 : B학점");
		case 7 :
			System.out.println("점수 : " + score + ", 학점 : C학점");
			break;
		default : 
			System.out.println("점수 : " + score + ", 학점 : F학점");
			
		}
	
	
	}

}
