package exam02;

public class UpDownExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		int sum = 0;
		
		sum = num++;
		
		System.out.print("sum =" + sum + ", num : " + num);
		
		sum = ++num;
		
		System.out.print("sum =" + sum + ", num : " + num);
	}

}