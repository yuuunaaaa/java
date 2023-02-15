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

public class 음식주문정보시스템2 {
	// 심화
	// 1) 버튼을 클릭 했을 때, 각 음식의 주문량을 체크해서 f의 title로  보여주세요!!
	// f.setTitle("음식주문시스템")
	// 2) 음식의 값을 다 분리, 짬뽕은 3500, 우동은 3000, 짜장은 4000
	
	static int count = 0; // 0으로 초기호, 전역변수!
	static int count1 = 0; // 0으로 초기호, 전역변수!
	static int count2 = 0; // 0으로 초기호, 전역변수!
	static int count3 = 0; // 0으로 초기호, 전역변수!
	static int total = 0; // 0으로 초기호, 전역변수!
	final static int PRICE1 = 4000; // final은 변경 불가, 상수
	final static int PRICE2 = 3500; // final은 변경 불가, 상수
	final static int PRICE3 = 3000; // final은 변경 불가, 상수
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
		JLabel cnt1 = new JLabel("짜장 | 0 | 0");
		JLabel cnt2 = new JLabel("짬뽕 | 0 | 0");
		JLabel cnt3 = new JLabel("우동 | 0 | 0");
		JLabel result = new JLabel("결제 금액 : 0원");
		Font font = new Font("D2Coding", 1, 20);
		Font font2 = new Font("D2Coding", 1, 50);
		

		f.setSize(480, 800);
		f.setTitle("음식 주문 시스템");
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.red);
		menu1.setFont(font);
		menu2.setFont(font);
		menu3.setFont(font);
		menu1.setBorderPainted(false);
		menu2.setBorderPainted(false);
		menu3.setBorderPainted(false);
		menu2.setHorizontalAlignment(0);
		menu1.setBackground(Color.yellow);
		menu2.setBackground(Color.yellow);
		menu3.setBackground(Color.yellow);
		cnt1.setFont(font2);
		cnt2.setFont(font2);
		cnt3.setFont(font2);
		center.setIcon(icon);
		textLabel.setFont(font);
		cntLabel.setFont(font);
		result.setFont(font2);

		menu1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("food1.png");
				center.setIcon(icon);
				count++;
				cntLabel.setText(count + "개");
				count1++;
				cnt1.setText("짜장 | " + count1 + " | " + count1 * PRICE1);
				total += count1 * PRICE1;
				result.setText("결제 금액 : " + total + "원");
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
				count2++;
				cnt2.setText("짬뽕 | " + count2 + " | " + count2 * PRICE2);
				total += count2 * PRICE2;
				result.setText("결제 금액 : " + total + "원");
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
				count3++;
				cnt3.setText("우동 | " + count3 + " | " + count3 * PRICE3);
				total += count3 * PRICE3;
				result.setText("결제 금액 : " + total + "원");
			}
		});

		f.add(menu1);
		f.add(menu2);
		f.add(menu3);
		f.add(textLabel);
		f.add(cntLabel);
		f.add(center);
		f.add(cnt1);
		f.add(cnt2);
		f.add(cnt3);
		f.add(result);
		f.setVisible(true);
	}
}
