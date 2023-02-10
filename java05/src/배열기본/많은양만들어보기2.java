package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		//
		int[] jumsu2 = new int[1000];
		int cnt = 0;
		int sum = 0;

		Random r = new Random(42);
		// 2부터 20까지 임의로 만들기
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(20) + 1;
			System.out.println(i + " : " + jumsu2[i]);

			if (jumsu2[i] >= 15) {
				cnt++;
				sum += jumsu2[i];
			}
		}
		System.out.println("15 이상 갯수 : " + cnt);
		System.out.println("15 이상 총함 : " + sum);
	}

}
