package 부품사용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 d1 = new 강아지();
		d1.name = "댕댕이";
		d1.age = 2;
		d1.밥먹기();
		System.out.println("강아지의 이름 : " + d1.name);
		System.out.println("강아지의 나이 : " + d1.age);
		
		강아지 d2 = new 강아지();
		d2.name = "멍멍이";
		d2.age = 3;
		d2.놀기();
		System.out.println("강아지의 이름 : " + d2.name);
		System.out.println("강아지의 나이 : " + d2.age);
	}

}
