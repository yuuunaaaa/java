package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {

	static int index = 2; // 현재 2부터 시작

	public static void main(String[] args) {
		String[] title = { "더 퍼스트 슬램덩크", "타이타닉", "아바타: 물의 길", "교섭", "바빌론" };
		String[] img = { "movie1.jpg", "movie2.jpg", "movie3" + ".jpg", "movie4.jpg", "movie5.jpg" };
		double[] jumsu = { 9.28, 9.72, 8.82, 6.62, 8.85 };

		JFrame f = new JFrame();
		JLabel top = new JLabel(title[2]);
		ImageIcon icon = new ImageIcon(img[2]);
		JLabel center = new JLabel(icon);
		JLabel under = new JLabel(String.valueOf(jumsu[2]));
		JButton left = new JButton("<<");
		JButton right = new JButton(">>");
		Font font = new Font("D2Coding", Font.BOLD, 40);
		Font font2 = new Font("D2Coding", Font.BOLD, 25);

		// 배치부품(객체)를 바꾸어주지 않으면 경계 레이아웃을 사용하도록 세팅
		// BorderLayout
		f.setSize(516, 530);
		f.setTitle("나의 영화 앨범");
		f.getContentPane().setBackground(Color.black);
		top.setFont(font);
		top.setHorizontalAlignment(0);
		top.setForeground(Color.red);
		center.setIcon(icon);
		center.setFont(font);
		center.setHorizontalAlignment(0);
		left.setFont(font2);
		right.setFont(font2);
		left.setBackground(Color.pink);
		right.setBackground(Color.pink);
		under.setFont(font);
		under.setHorizontalAlignment(0);
		under.setForeground(Color.blue);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					top.setText(title[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					under.setText(jumsu[index - 1] + "");
					index--;
				} else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
				}
			}
		});

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					top.setText(title[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					under.setText(jumsu[index + 1] + "");
					index++;
				} else {
					JOptionPane.showMessageDialog(f, "더 이상 없습니다.");
				}
			}
		});

		f.add(top, BorderLayout.NORTH);
		f.add(left, BorderLayout.WEST);
		f.add(center, BorderLayout.CENTER);
		f.add(right, BorderLayout.EAST);
		f.add(under, BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프로그램이 끝나면 자동으로 exit
		f.setVisible(true);
	}

}
