package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {

	public static void main(String[] args) {
		// 인덱스 , 순서, 직접접근! ==> ArrayList()
		ArrayList list = new ArrayList();
		list.add("홍길동"); // Object <- String (자동형변환)
		list.add(100); // Object <- Integer(랩퍼클래스) <- 오토박싱 - int(기본형)
		list.add(11.22); // Object <- Double(랩퍼클래스, 포장클래스) <- 오토박싱 - double(기본형)
		list.add(new JButton()); // Object <- JButton
		// Integer <---- 오토박싱 ---- int
		//			---- 오토언박싱 ----
		
		String name = (String)list.get(0); // 직접접근! 랜덤 엑세스 가능! 강제형변환
		// String <- Object, 강제형변환
		int age = (Integer)list.get(1);
		// int <- Integer <- Object, 오토언박싱, 강제형변환
	}

}
