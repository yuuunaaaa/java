package 배열응용;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임 만들기
		JFrame f = new JFrame();

		// 2. 프레임 설정. 실행해서 눈으로 확인
		f.setLayout(null);
		f.setSize(1200, 800);

		// 3. 버튼을 넣을 배열을 먼저 만들기 (500개)
		JButton[] b = new JButton[500];

		Random r = new Random();
		Color[] colors = { Color.red, Color.blue, Color.white, Color.gray, Color.green };

		// 4. 버튼을 500개 만들어서 배열에 넣기
		for (int i = 0; i < b.length; i++) {
			b[i] = new JButton("버튼 " + i);

			// 5. 배열에 있는 버튼을 꺼내서 위치를 지정 후, f에 붙이기
			int x = r.nextInt(800);
			int y = r.nextInt(700);

			b[i].setBounds(x, y, 100, 50);

			// 심화-1) 버튼 색을 몇 가지 지정해서 임의로 설정, 힌트 Color 배열

			b[i].setBackground(colors[r.nextInt(colors.length)]);

			f.add(b[i]);

		}
		// 심화-2) f에 배경색 넣기
		f.getContentPane().setBackground(Color.yellow);

		f.setVisible(true);
	}

}
