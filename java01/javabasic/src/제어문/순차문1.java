package 제어문;

import javax.swing.JOptionPane;

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

public class 순차문1 {

	public static void main(String[] args) {
		// 프로그램을 어떤 순서대로 짜야할까?
		// 1. 입력 : 데이터를 가지고 와요
		// 2. 처리 : 특정한 작업 수행
		// 3. 출력 : 처리한 내용을 보여주세요.
		// 자바는 자주 사용하는 부품은 대문자로 바로 쓸 수 있어요!
		// 외부에서 대화창 같은 것으로 입력받은 경우는 무조건 컴퓨터 String(문자열)로 인식
		 String name = JOptionPane.showInputDialog("당신의 이름은?");
		 
		// 처리
		String result = "나의 이름은 " + name + "입니다.";
		System.out.println(result); 
	}

}
