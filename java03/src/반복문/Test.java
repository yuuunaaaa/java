package 반복문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		JLabel l = new JLabel();
		JButton b1 = new JButton();
		JButton b2 = new JButton();
		JButton b3 = new JButton();
		JButton b4 = new JButton();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding", 1, 50);

		f.setSize(330, 350);
		f.getContentPane().setBackground(Color.gray);
		f.setLayout(flow);

		b1.setText("별 10개");
		b2.setText("커피 * 5");
		b3.setText("커피 * 우유3");
		b4.setText("1:짱!");

		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		f.add(l);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);

		// 1) 버튼에다가 액션 기능을 추가하겠다고 설정
		// 2) 클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게 할지 코딩
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리하고 싶은 내용
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리하고 싶은 내용
				for (int i = 0; i < 5; i++) {
					System.out.print("커피*");
				}
				System.out.println();
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리하고 싶은 내용
				for (int i = 0; i < 3; i++) {
					System.out.println("커피*우유");
				}
			}
		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리하고 싶은 내용
				for (int i = 1; i < 4; i++) {
					System.out.println(i + " : 짱!");
				}
			}
		});

		f.setVisible(true);
	}

}
