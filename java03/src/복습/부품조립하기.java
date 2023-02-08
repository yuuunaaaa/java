package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주 써서 RAM에 언제든 사용할 수 있도록 준비되어 있음.
		//	    망치
		//	    부품명.기능()
		
		// 2. 쓸때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어 RAM에
		//	    저장해두고 사용
		
		JFrame f = new JFrame();
		f.setSize(400, 300);
		
		JLabel l = new JLabel();
		l.setText("당신이 생각한 숫자를 입력하세요.");
		
		JTextField text = new JTextField(10); // 입력칸
		JButton b = new JButton(); // 버튼
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding", 1, 20);
		Font font2 = new Font("D2Coding", 1, 30);
		
		

		l.setFont(font);
		l.setBackground(Color.red);
		
		b.setBackground(Color.blue);
		b.setForeground(Color.white);
		b.setFont(font2);
		b.setText("Number Game");
		// JFram에 배치를 물 흐르듯이 순서대로 붙여주는 부품 설
		f.setLayout(flow);
		
		// 입력칸 색, 폰트 설정
		text.setBackground(Color.cyan);
		text.setBackground(Color.blue);
		text.setFont(font2);
		
		f.add(l); // f라는 부품 위에 조립해서 올려놔라!
		f.add(text);
		f.add(b);
		
		// 맨 아래에!!
		f.setVisible(true);
	}

}
