package 제어문문제;

import java.util.Random;

public class 로또번호생성기2 {

	public static void main(String[] args) {
		// 아무 값이나 발생시키는 부품 ==> Random
		Random r = new Random(100); //씨앗값, seed값!
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호 : " + r.nextInt(10));
		}

	}

}
