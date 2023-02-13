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

import com.sun.corba.se.spi.orbutil.fsm.Guard.Result;

import jdk.internal.dynalink.beans.StaticClass;
import sun.awt.geom.AreaOp.AddOp;

public class 극장예매시스템2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("극장 예매 시스템");
		f.setSize(800, 800);
		f.getContentPane().setBackground(Color.green);
		// 배치해주는 부품 - FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // 추가한 순서대로 f에 붙음

		Font font = new Font("D2Coding", 1, 20);

		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font);

		// 예약 여부를 저장하는 배열을 만들어줍시다.!!
		int[] seat = new int[200]; // {0,0,0,0,0,0,0,0,0,0}
		// 각 자리게 저장된 값이 0이면 아직 예약안되었음. 예약되면 1로 바꿈!

		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성
		JButton[] btn = new JButton[200];
		// 반복해서 배열에 버튼 만들어 넣기
		// 반복해서 f에 add
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton(i + "");
			btn[i].setFont(font);
			f.add(btn[i]);

			// 버튼에 액션기능 add
			// 1) 액션 기능 추가
			// 2) 클릭 했을 때 어떤 부품이 담당할지 부품 생성
			// 3) 클릭 했을 때 어떻게 처리할지 코딩해주면 됨
			btn[i].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩해주면 됨.
					// e.getActionCommand(); 클릭한 버튼의 글자를 가지고 와줌.
					String text = e.getActionCommand();
					System.out.println(text);
					int no = Integer.parseInt(text);
					// 이미 해당 좌석 번호가 1로 저장되어 있는 지 확인하고, 1이 아니면 예약 가능

					if (seat[no] == 1) { // 이미 예약되어 1이 들어 있음. 예약 불가
						result.setText(text + "번 예약 불가.");
						result.setForeground(Color.blue);
					} else { // 아직 예약이 안되어서 0이 들어있음. 예약 가능
						seat[no] = 1; // 예약좌석은 1로 변경
						result.setText(text + "번 예약완료.");
						btn[no].setBackground(Color.red);
						btn[no].setEnabled(false);
					}
				}
			});
		}
		f.add(result);

		JButton total = new JButton("전체 예매 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.yellow);
		total.setFont(font);

		f.add(total);
		
		
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 내용 넣기
				// 배열에 몇개가 1인지 더해줌
				int cnt = 0;
				
				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {
						cnt++;
					}
				}
//				for (int x : seat) {
//					if (x == 1) {
//						cnt++;
//					}
//				}
				// 영화 예매비 1장당 1만원, 결제 금액 프린트
				JOptionPane.showMessageDialog(f, (cnt * 10000) + "원 결제 하시면 됩니다.");
			}
		});
		f.setVisible(true);

	}

}
