package 반복문;

import javax.swing.JOptionPane;

public class 누적연습2 {

	public static void main(String[] args) {
		// 1. 숫자 누적
		int sum = 0;
		for (int i = 5; i <= 300; i++) {
			if (i % 5 == 0) {
				sum = sum + i;
			}
		}
			System.out.println("전체 합은 >> " + sum);
		
		// 2. 문자 누적
		String sum2 = "";
		for (int i = 0; i < 4; i++) {
			String data = JOptionPane.showInputDialog("먹고 싶은 음식 입력");
			sum2 = sum2 + data + "랑 ";
		}
		System.out.println(sum2);
	}

}
