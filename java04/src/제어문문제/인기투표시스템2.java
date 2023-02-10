package 제어문문제;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 인기투표시스템2 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();

		JLabel title = new JLabel(); // 제목
		title.setText("K-pop 인기 투표");

		JButton iuButton = new JButton();
		JButton btsButton = new JButton();
		JButton newjeansButton = new JButton();

		ImageIcon iuIcon = new ImageIcon("iu.jpg");
		ImageIcon btsIcon = new ImageIcon("bts.jpg");
		ImageIcon newjeansIcon = new ImageIcon("newjeans.jpg");

		JLabel iu = new JLabel(); // 아이유
		iu.setText("1. 아이유 - Lilac");
		JLabel iuVote = new JLabel(); // 아이유 투표
		iuVote.setText("0표");

		JLabel bts = new JLabel(); // 방탄
		bts.setText("2. 방탄소년단 - Dynamite");
		JLabel btsVote = new JLabel(); // 방탄 투표
		btsVote.setText("0표");

		JLabel newjeans = new JLabel(); // 뉴진스
		newjeans.setText("3. 뉴진스 - Ditto");
		JLabel newjeansVote = new JLabel(); // 뉴진스 투표
		newjeansVote.setText("0표");

		Font font1 = new Font("굴림", 1, 30);
		Font font2 = new Font("D2Coding", 1, 15);

		f.setSize(500, 600);
		f.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));

		f.add(title);
		title.setFont(font1);

		f.add(iuButton);
		f.add(iu);
		f.add(iuVote);
		f.add(btsButton);
		f.add(bts);
		f.add(btsVote);
		f.add(newjeansButton);
		f.add(newjeans);
		f.add(newjeansVote);
		iuButton.setFont(font2); // 버튼 폰트
		btsButton.setFont(font2);
		newjeansButton.setFont(font2);
		iuButton.setIcon(iuIcon); // 버튼 아이콘
		btsButton.setIcon(btsIcon);
		newjeansButton.setIcon(newjeansIcon);

		
		
		iu.setFont(font2);
		iuVote.setFont(font2);

		bts.setFont(font2);
		btsVote.setFont(font2);

		newjeans.setFont(font2);
		newjeansVote.setFont(font2);

		iuButton.addActionListener(new ActionListener() {
			int iuCnt = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				iuCnt++;
				iuVote.setText(iuCnt + "표");
			}
		});

		btsButton.addActionListener(new ActionListener() {
			int btsCnt = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				btsCnt++;
				btsVote.setText(btsCnt + "표");
			}
		});

		newjeansButton.addActionListener(new ActionListener() {
			int newjeansCnt = 0;

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				newjeansCnt++;
				newjeansVote.setText(newjeansCnt + "표");
			}
		});

		f.setVisible(true);

	}
}
