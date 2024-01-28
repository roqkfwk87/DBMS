package problem.exam2;

public class Soiution_Main {

	public static void main(String[] arge) {
        Solution sol = new Solution();
        int[] leftGloves = {2, 1, 2, 2, 4};
        int[] rightGloves = {1, 2, 2, 4, 4, 7};
        int ret = sol.solution(leftGloves, rightGloves);
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 변환 값은" + ret + " 입니다");
    }
}
