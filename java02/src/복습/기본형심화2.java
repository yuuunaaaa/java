package 복습;

public class 기본형심화2 {

	public static void main(String[] args) {
		// 기본형 4가지
		// 정수, 실수,   문자1, 논리
		// int  double char boolean
		// 온도
		double temp = 1.2;
		int floor = 3;
		char color = 'b';
		boolean juice = false;
		
		String loacation = "선릉역";
		
		// System - 컴퓨터, out(출력장치) - 모니터
		//				  in (입력장치) - 키보드
		System.out.println("오늘 온도는 " + temp + " 도");
		System.out.println("현재 층은 " + floor + "층");
		System.out.println("오늘 탄 버스의 색은 " + color + "색");
		System.out.println("오늘 주스를 먹었나요?" + juice);		
		System.out.println("현재 위치는?" + loacation);		
	}
}
