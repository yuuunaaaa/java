package 배열;

public class 배열문제 {
	public static void main(String[] args) {
		// 문제
		int[] x = new int[5];
		System.out.println(x.length);
		
		x[0] = 100;
		System.out.println(x[0]);
		x[4] = 500;
		System.out.println(x[4]);
		x[2] = 200;
		System.out.println(x[2]);
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(i + "번째 - " + x[i]);
		}
		
	}
}
