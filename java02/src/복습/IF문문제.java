package 복습;

import java.util.Date;
import java.util.Scanner;

import javax.swing.JOptionPane;

import jdk.nashorn.internal.ir.Flags;

public class IF문문제 {
	public static void main(String[] args) {
		
//		// 문제 1
//		Date date = new Date();
//		int year = date.getYear() + 1900;
//		if (year >= 2000) {
//			System.out.println("밀레니엄 세대시군요");
//		} else {
//			System.out.println("밀레니엄 세대가 아니시군요");
//		}
//		
//		// 문제 2
//		int day = date.getDay();
//		if (day == 0 || day == 6) {
//			System.out.println("쉬~~~~~~~~자");
//		} else {
//			System.out.println("열~~심히 공부하자");
//		}
//		
//		// 문제 3
//		int month = date.getMonth() + 1;
//		switch (month) {
//		case 2:
//			System.out.println("28일까지");
//			break;
//		case 4: case 6: case 9: case 11:
//			System.out.println("30일까지");
//			break;
//		default:
//			System.out.println("31일까지");
//			break;
//		}
//		
//		// 문제 1
//		System.out.println("암호를 대시오");
//		Scanner sc = new Scanner(System.in);
//		String pw = sc.next();
//		if (pw.equals("pass")) {
//			System.out.println("들어오세요");
//		} else {
//			System.out.println("나가세요");
//		}
//		
//		// 문제 2
//		System.out.println("당신이 먹고싶은 저녁 메뉴는(자장면, 라면, 회)에서 선택");
//		String menu = sc.next();
//		if (menu.equals("자장면")) {
//			System.out.println("중국집으로 가요");
//		} else if (menu.equals("라면")){
//			System.out.println("분식집으로 가요");
//		} else if(menu.equals("회")) {
//			System.out.println("횟집으로 가요");
//		} else {
//			System.out.println("그냥 안먹어요");
//		}
//		
//		// 문제 3
//		String data1 = JOptionPane.showInputDialog("정수 1 입력");
//		String data2 = JOptionPane.showInputDialog("정수 2 입력");
//		
//		int d1 = Integer.parseInt(data1);
//		int d2 = Integer.parseInt(data2);
//		
//		if (d1 > d2) {
//			System.out.println("정수 1이 더 큽니다");
//		} else {
//			System.out.println("정수 2가 더 큽니다");
//		}
//		
//		// 문제 4
//		String no = "A100EX";
//		char data = no.charAt(0);
//		
//		if (data == 'A') {
//			System.out.println("기획부");
//		} else if(data == 'B') {
//			System.out.println("총무부");
//		} else if(data == 'C') {
//			System.out.println("개발부");
//		} else {
//			System.out.println("해당 부서 없음");
//		}
//		 
//		// 문제 1 - 두 수와 사칙연산자를 입력받아 두 수를 사칙연산자에 따라 처리후 출력
//		String num1 = JOptionPane.showInputDialog("정수 1 입력");
//		String num2 = JOptionPane.showInputDialog("정수 2 입력");
//		String data = JOptionPane.showInputDialog("사칙연산자 입력");
//		int n1 = Integer.parseInt(num1);
//		int n2 = Integer.parseInt(num2);
//		
//		if (data.equals("+")) {
//			System.out.println(n1+n2);
//		} else if (data.equals("-")) {
//			System.out.println(n1-n2);
//		} else if (data.equals("*")) {
//			System.out.println(n1*n2);
//		} else if (data.equals("/")) {
//			System.out.println(n1/n2);
//		}
		
		// 문제 2 - 두 수를 입력받아 정수로 변환하여 정수변수에  저장, 나누기 연산 수행후 소숫점 2째자리까지 출력!
		String num1 = JOptionPane.showInputDialog("정수 1 입력");
		String num2 = JOptionPane.showInputDialog("정수 2 입력");
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		double div = (double)n1 / n2;
		String result = String.format("%.2f", div);
		System.out.println(result);
	}
}
