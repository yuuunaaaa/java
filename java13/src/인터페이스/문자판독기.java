package 인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import org.omg.CORBA.PUBLIC_MEMBER;

public class 문자판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("문자판독기");
		f.setSize(300, 500);
		// flow를 만들어두고, 아래 코드에서 flow를 쓰는 경우
		// FlowLayout = new FlowLayout();
		// 한 번 쓰고 아래 코드에서 쓸 일이 없는 경우 아래처럼 사용
		f.setLayout(new FlowLayout());

		Font font = new Font("D2Coding", Font.BOLD, 25);

		JLabel label = new JLabel("문장을 넣으세요");
		JTextArea area = new JTextArea(8, 10);
		JButton b1 = new JButton("글자수카운트");
		JButton b2 = new JButton("배경색바꾸기");
		JButton b3 = new JButton("글자색바꾸기");

		label.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		f.add(label);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int text = area.getText().length();
				JOptionPane.showMessageDialog(f, "글자 수는 " + text);
				area.setText("" );
			}
		}); // 익명클래스

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setBackground(Color.yellow);
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				area.setForeground(Color.red);
			}
		});

		f.setVisible(true);
	}

}
