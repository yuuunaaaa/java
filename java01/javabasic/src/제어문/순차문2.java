package 제어문;

import javax.swing.JOptionPane;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class 순차문2 {

	public static void main(String[] args) {
		// 프로그램을 어떤 순서대로 짜야할까?
		// 1. 입력 : 데이터를 가지고 와요
		// 2. 처리 : 특정한 작업 수행
		// 3. 출력 : 처리한 내용을 보여주세요.
		// 자바는 자주 사용하는 부품은 대문자로 바로 쓸 수 있어요!
		// 외부에서 대화창 같은 것으로 입력받은 경우는 무조건 컴퓨터 String(문자열)로 인식
		
		
//		 String workOut = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
//		 String day = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
//		 
//		// 처리
//		String result = day + "에 저는  " + workOut + "를 합니다.";
//		System.out.println(result); 
		
		// 문제 1
		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String after = JOptionPane.showInputDialog("수업 끝나고 무엇을 하실 예정인가요?");
		 
		// 처리
		String result = "오늘 " + day + "에 수업 후 나는 " + after + "를 할 예정";
		System.out.println(result); 
		
		// 문제 2
		int num1 = 30;
		int num2 = 40;
		
		System.out.println("두 수의 합 : " + (num1 + num2));
		System.out.println("num1에서 num2를 나눈 값 : " + (num2 / num1));
		System.out.println("num1에서 num2를 나눌 때 나머지 : " + (num2 % num1));
		
		// 문제 3
		double x = 33.3;
		double y = 22.2;
		
		System.out.println(x == 44.2);
		System.out.println(x == y);
		System.out.println(y > 55);
		
		// 문제 4
		String hobby = JOptionPane.showInputDialog("당신의 취미는?");
		int times = 1;
		double time = 2.5;
		char d = '밤';
		boolean fun = true;
		System.out.println("나의 취미는 " + hobby);
		System.out.println("하루에 " + times + "번");
		System.out.println(time + "시간");
		System.out.println("재미?" + fun);
	}

}