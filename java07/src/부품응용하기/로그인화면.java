package 부품응용하기;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		FlowLayout flow = new FlowLayout();
		Font font = new Font("D2Coding", 1, 20);

		JLabel top = new JLabel();
		JLabel id = new JLabel("아 이 디 : ");
		JLabel pw = new JLabel("패스워드 : ");

		ImageIcon icon1 = new ImageIcon("01.jpg");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");

		JTextField idText = new JTextField(9);
		JTextField pwText = new JTextField(9);

		JButton login = new JButton();
		JButton reset = new JButton();

		f.setTitle("내 일기장 로그인");
		f.setSize(300, 400);
		f.getContentPane().setBackground(Color.lightGray);
		f.setLayout(flow);
		top.setIcon(icon1);
		login.setIcon(icon2);
		reset.setIcon(icon3);
		top.setFont(font);
		id.setFont(font);
		pw.setFont(font);
		idText.setFont(font);
		pwText.setFont(font);
		login.setBackground(Color.white);
		reset.setBackground(Color.white);

		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// idText, pwText에 getText()
				String id2 = idText.getText(); // "root"
				String pw2 = pwText.getText(); // "1234"
				
				if (id2.equals("root") && pw2.equals("1234")) {
					JOptionPane.showMessageDialog(f, "로그인 성공!");
					// 일기장쓰기 부품의 open()기능을 쓰자!
					일기장쓰기 diary = new 일기장쓰기();
					diary.open(); // 메서드 사용 ==> 메서드 호출!!
					f.setVisible(false);
					
				} else {
					JOptionPane.showMessageDialog(f,  "로그인 실패!");
				}

			}
		}); // login add end

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// reset을 눌렀을 때 idText, pwText에 공백 넣기
				idText.setText("");
				pwText.setText("");

			}
		}); // reset add end

		f.add(top);
		f.add(id);
		f.add(idText);
		f.add(pw);
		f.add(pwText);
		f.add(login);
		f.add(reset);
		f.setVisible(true);

	}

}
