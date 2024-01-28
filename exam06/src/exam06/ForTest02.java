package exam06;

public class ForTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0; //합산을 위한 변수
		
		for(int i = 1; i<=100; i++) {
			
			if(i %2 == 0) {
			sum = sum + i;
			}
		}
	//5050 -> 2550(짝수) 2500(홀수)
	System.out.println("짝수의 합! : " + sum);
	
	
	}

}
