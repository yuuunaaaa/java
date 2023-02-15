package 생성자맛보기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 음식주문정보시스템 {
	static int count = 0; // 0으로 초기호, 전역변수!
	final static int PRICE = 5000; // final은 변경 불가, 상수
	// 상수 변수를 쓸 때는 잘보이라고 변수명을 모두 대문자로! 권장!!!
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		JButton menu1 = new JButton("짜장");
		JButton menu2 = new JButton("짬뽕");
		JButton menu3 = new JButton("우동");
		JLabel textLabel = new JLabel("개수 : ");
		JLabel cntLabel = new JLabel("0개");
		ImageIcon icon = new ImageIcon("home.png");
		JLabel center = new JLabel(icon);
		JLabel result = new JLabel("결제 금액 : 0원");
		Font font = new Font("D2Coding", 1, 20);

		f.setSize(600, 500);
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.red);
		menu1.setFont(font);
		menu2.setFont(font);
		menu3.setFont(font);
		menu1.setBorderPainted(false);
		menu2.setBorderPainted(false);
		menu3.setBorderPainted(false);
		menu1.setBackground(Color.yellow);
		menu2.setBackground(Color.yellow);
		menu3.setBackground(Color.yellow);
		center.setIcon(icon);
		textLabel.setFont(font);
		cntLabel.setFont(font);
		result.setFont(font);

		menu1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("food1.png");
				center.setIcon(icon);
				count++;
				cntLabel.setText(count + "개");
				result.setText("결제 금액 : " + count * PRICE + "원");
			}
		});

		menu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("food2.png");
				center.setIcon(icon);
				count++;
				cntLabel.setText(count + "개");
				result.setText("결제 금액 : " + count * PRICE + "원");
			}
		});

		menu3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("food3.png");
				center.setIcon(icon);
				count++;
				cntLabel.setText(count + "개");
				result.setText("결제 금액 : " + count * PRICE + "원");
			}
		});

		f.add(menu1);
		f.add(menu2);
		f.add(menu3);
		f.add(textLabel);
		f.add(cntLabel);
		f.add(center);
		f.add(result);
		f.setVisible(true);
	}
}
