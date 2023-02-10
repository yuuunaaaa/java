package 제어문문제;

import java.util.Scanner;

public class 인기투표시스템 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("      인기투표 시스템");
		System.out.println("=======================");
		int data = 0; // 입력 받은 값
		int iu = 0; // 아이유 투표 수
		int bts = 0; // 방탄 투표 수
		int newjeans = 0; // 뉴진스 투표 수
		
		for (int i = 0; i < 10; i++) {
			System.out.print("1)아이유 2)방탄 3)뉴진스 4)종료 >>");
			data = sc.nextInt();
			if (data == 4){
				break;
			} else if (data == 1){
				iu++;
			} else if (data == 2) {
				bts++;
			} else if (data == 3){
				newjeans++;
			} 
		}
		
		System.out.println("=======================");
		System.out.println("아이유 " + iu + "표");
		System.out.println("방탄 " + bts + "표");
		System.out.println("뉴진스 " + newjeans + "표");
		System.out.println("=======================");

		
	}
}
