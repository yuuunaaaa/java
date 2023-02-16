package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame("카운터 프로그램");
		FlowLayout flow = new FlowLayout();
		JLabel number = new JLabel("0");
		Font font = new Font("D2Coding", Font.BOLD, 150);
		JButton b1 = new JButton("1 더하기");
		JButton b2 = new JButton("0으로 초기화");
		JButton b3 = new JButton("1 빼기");

		f.setSize(300, 300);
		f.getContentPane().setLayout(flow);
		number.setForeground(Color.red);
		number.setFont(font);
		b1.setBackground(Color.green);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.green);
		b1.setForeground(Color.black);
		b2.setForeground(Color.white);
		b3.setForeground(Color.black);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count + "");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count + "");
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count + "");
			}
		});

		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(number);

		f.setVisible(true);
	}

}
