package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		// int target = 77;
		Random r = new Random();
		int target = r.nextInt(100); // 0~99
		Scanner sc = new Scanner(System.in);
		int data = 0;
		int cnt = 0;
		while (true) {
			System.out.print("생각한 정답은?? ");
			data = sc.nextInt();
			cnt++;
			if (data == target) {
				System.out.println("정답입니다. (시도 횟수 : " + cnt + ")");
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("오답입니다. (시도 횟수 : " + cnt + ")");
				//System.out.println("다시 시도해주세요.");
				if (data > target) {
					System.out.println("너무 커요");
				} else {
					System.out.println("너무 작아요");
				}
			} 
			
		}
		sc.close();
	}

}
