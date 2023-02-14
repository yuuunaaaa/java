package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기장쓰기 {
	// 멤버변수 - 안써도 됨
	// 멤버 메서드
	public void open() {
		// jframe 화면이 보이게 기능을 정의
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding", 1, 20);
		JLabel date = new JLabel("오늘의 날짜 : ");
		JLabel title = new JLabel("오늘의 제목 : ");
		JLabel content = new JLabel("오늘의 내용 : ");
		JTextField dateText = new JTextField(10);
		JTextField titleText = new JTextField(10);
		JTextArea contentText = new JTextArea(5, 10);
		JButton btn = new JButton("파일에 일기 저장");

		f.setTitle("내 일기장 작성화면");
		f.setSize(400, 350);
		f.getContentPane().setBackground(Color.lightGray);
		f.setLayout(flow);
		date.setFont(font);
		title.setFont(font);
		content.setFont(font);
		dateText.setFont(font);
		titleText.setFont(font);
		contentText.setFont(font);
		btn.setFont(font);
		dateText.setHorizontalAlignment(JTextField.CENTER);
		titleText.setHorizontalAlignment(JTextField.CENTER);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 날짜, 제목, 내용 입력한 것을 가지고 오기
				String date2 = dateText.getText();
				String title2 = titleText.getText();
				String content2 = contentText.getText();
				System.out.println(date2 + "\n" + title2 + "\n" + content2);
				// 파일도 만들어주고,
				// 자바 프로그램과  file 간에 연결 통로(강물, stream)을 만들어준다.
				// 외부에 있는 파일, 네트워크나 cpu 등을 자바에서 연결할 때는
				// 아주 위험한 상황이라고 인식!!
				// 이렇게 위험한 상황에서 만약 문제가 발생하면
				// 어떻게 처리할지를 꼭 써주어야 함!!
				try {
					FileWriter file = new FileWriter(date2 + ".txt");
					file.write(date2 + "\n");
					file.write(title2 + "\n");
					file.write(content2 + "\n");
					file.close();
				} catch (IOException e1) {
					// 처리할 내용 넣기
					System.out.println("파일로 저장하는 중 문제 발생!");
				}
			}
		});
		
		f.add(date);
		f.add(dateText);
		f.add(title);
		f.add(titleText);
		f.add(content);
		f.add(contentText);
		f.add(btn);
		f.setVisible(true);
	}
}
