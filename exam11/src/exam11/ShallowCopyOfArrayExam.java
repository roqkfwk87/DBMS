package exam11;

public class ShallowCopyOfArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[] arr01 = {1, 3, 5, 7, 9};
	int[] arr02 = null;
			
	// 얕은 복사
	arr02 = arr01;
	
	for(int i = 0; i < arr02.length; i++) {
		System.out.println(arr02[i] + "\t");
	}
	
	arr02[1] = 11;
	arr01[0] = 8;
	
	System.out.println();
	System.out.println("arr02 값 출력 : ");
	for(int i = 0; i < arr02.length; i++) {
		System.out.println(arr01[i] + "\t");
	}
	
	
	}

}
