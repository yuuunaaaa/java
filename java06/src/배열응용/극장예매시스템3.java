package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템3 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		JButton[] btn = new JButton[201];
		Font font = new Font("D2Coding", 1, 20);
		JLabel result = new JLabel("결과 보이는 곳");
		JButton total = new JButton("결제");
		
		int[] seat = new int[201];
		
		f.setTitle("극장 예매 시스템");
		f.setSize(1000, 900);
		f.setLayout(flow);
		f.getContentPane().setBackground(Color.lightGray);
		
		for (int i = 1; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);
			
			btn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String text = e.getActionCommand();
					int no = Integer.parseInt(text);
					
					if (seat[no] == 1) {
						result.setText(text + "번 예약 불가");
					} else {
						seat[no] = 1;
						result.setText(text + "번 예약 완료");
						btn[no].setEnabled(false);
					}
					
				}
			});
		}
		
		total.addActionListener(new ActionListener() {
			int cnt = 0;
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int x : seat) {
					if (x == 1) {
						cnt++;
					}
				}
				JOptionPane.showMessageDialog(f, (cnt * 10000) + "원 결제 하시면 됩니다.");
				
			}
		});
		
		f.add(result);
		result.setFont(font);
		
		f.add(total);
		total.setFont(font);
		
		f.setVisible(true);
	}

}
