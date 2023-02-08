package 조건문;

import javax.swing.JOptionPane;

public class 인기조사10명 {

	public static void main(String[] args) {
		// 1) 아이유 2) 뉴진스 3) BTS
		int iu = 0;
		int newjeans = 0;
		int bts = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("숫자로 투표해주세요 - 1) 아이유 2) 뉴진스 3) BTS");
			if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")) {
				newjeans++;
			}else if (data.equals("3")) {
				bts++;
			}
		}System.out.println("아이유를 투표한 사람 - " + iu + "명");
		System.out.println("뉴진스를 투표한 사람 - " + newjeans + "명");
		System.out.println("BTS를 투표한 사람 - " + bts + "명");
	}

}
