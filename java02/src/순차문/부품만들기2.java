package 순차문;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 300);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel text1 = new JLabel();
		text1.setText("아이디");
		
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		
		JTextField input1 = new JTextField(10);
		JTextField input2 = new JTextField(10);
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼~");
		
		JButton b2 = new JButton();
		b2.setText("나는 버튼~");
		
		Font font = new Font("궁서", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		b1.setBackground(Color.blue); // 배경색
		b1.setForeground(Color.white); // 버튼 위의 색, 글자색
		b2.setBackground(Color.blue); // 배경색
		b2.setForeground(Color.white); // 버튼 위의 색, 글자색
		input1.setBackground(Color.blue); // 배경색
		input1.setForeground(Color.white); // 버튼 위의 색, 글자색
		input2.setBackground(Color.blue); // 배경색
		input2.setForeground(Color.white); // 버튼 위의 색, 글자색
		
		//no.png 파일명을 쓰면 java02프로젝트 바로 아래 있는 것으로 인식!
		ImageIcon icon = new ImageIcon("no.png");
		ImageIcon icon2 = new ImageIcon("ok.png");
		
		b1.setIcon(icon);
		b2.setIcon(icon2);
		
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		f.setVisible(true);
	}
}