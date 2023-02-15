package 생성자맛보기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class 주문정보시스템 {
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
		JButton menu1 = new JButton("버거");
		JButton menu2 = new JButton("음료");
		JButton menu3 = new JButton("아이스크림");
		JLabel textLabel = new JLabel("총 ");
		JLabel cntLabel = new JLabel("0개");
		ImageIcon icon = new ImageIcon("burger1.png");
		JLabel center = new JLabel(icon);
		JLabel cnt1 = new JLabel("버거 | 0 | 0");
		JLabel cnt2 = new JLabel("음료 | 0 | 0");
		JLabel cnt3 = new JLabel("아이스크림 | 0 | 0");
		JLabel result = new JLabel("결제 금액 : 0원");
		Font font = new Font("D2Coding", 1, 20);
		JPanel p1 = new JPanel();
		p1.setLayout(flow);
		JPanel p2 = new JPanel();
		p2.setLayout(flow);
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(4, 1, 2, 2));
		
		
		f.setSize(550, 550);
		f.setTitle("음식 주문 시스템");
		f.setLayout(new BorderLayout());
		f.getContentPane().setBackground(Color.white);
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
		menu1.setForeground(Color.red);
		menu2.setForeground(Color.red);
		menu3.setForeground(Color.red);
		cnt1.setFont(font);
		cnt2.setFont(font);
		cnt3.setFont(font);
		center.setIcon(icon);
		textLabel.setFont(font);
		cntLabel.setFont(font);
		result.setFont(font);

		cnt1.setHorizontalAlignment(0);
		cnt2.setHorizontalAlignment(0);
		cnt3.setHorizontalAlignment(0);
		result.setHorizontalAlignment(0);

		menu1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("burger1.png");
				center.setIcon(icon);
				count++;
				cntLabel.setText(count + "개");
				count1++;
				cnt1.setText("버거 | " + count1 + " | " + count1 * PRICE1);
				total += count1 * PRICE1;
				result.setText("결제 금액 : " + total + "원");
			}
		});

		menu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("burger2.png");
				center.setIcon(icon);
				count++;
				cntLabel.setText(count + "개");
				count2++;
				cnt2.setText("음료 | " + count2 + " | " + count2 * PRICE2);
				total += count2 * PRICE2;
				result.setText("결제 금액 : " + total + "원");
			}
		});

		menu3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ImageIcon icon = new ImageIcon("burger3.png");
				center.setIcon(icon);
				count++;
				cntLabel.setText(count + "개");
				count3++;
				cnt3.setText("아이스크림 | " + count3 + " | " + count3 * PRICE3);
				total += count3 * PRICE3;
				result.setText("결제 금액 : " + total + "원");
			}
		});
		

        p1.add(menu1);
        p1.add(menu2);
        p1.add(menu3);
		p1.add(textLabel);
		p1.add(cntLabel);
		
		p2.add(center);
		
		p3.add(cnt1);
		p3.add(cnt2);
		p3.add(cnt3);
		p3.add(result);
		
		f.add(p1, BorderLayout.NORTH);
		f.add(p2, BorderLayout.CENTER);
		f.add(p3, BorderLayout.SOUTH);
		
		f.setVisible(true);
	}
}
