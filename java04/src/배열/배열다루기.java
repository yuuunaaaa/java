package 배열;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10];
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		
//		System.out.println(x[0]);
//		System.out.println(x[1]);
//		System.out.println(x[2]);
		
		// 우리 가족의 성별을 char로 저장
		char[] gender = {'남', '여', '여', '여'};
		String[] name = {"홍길동", "김길동", "홍길순", "홍길정"};
		double[] eye = {1.2, 1.0, 0.9, 1.1};
		boolean[] dinner = {true, true, false, false};
		
		for (int i = 0; i < dinner.length; i++) {
			System.out.println(gender[i]);
			System.out.println(name[i]);
			System.out.println(eye[i]);
			System.out.println(dinner[i]);
		}
		
	}

}
