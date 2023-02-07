package 순차문;

// 부품이 있는 위치를 알려주는 역할
import javax.swing.JOptionPane;

public class 순차문2 {
	public static void main(String[] args) {
		// 기본 순차문 == 입력 --> 처리 --> 출력
		// 입력 -> 부품 사용, 망치같은 언제나 바로 사용할 수 있는 것! 사용해보자!
		// 다이얼로그 같은 곳에서 입력한 값은 컴퓨터는 무조건 String으로 인식!
		String height = JOptionPane.showInputDialog("키를 입력하시오");
		String weight = JOptionPane.showInputDialog("몸무게를 입력하시오");
		
		// 처리 -> 숫자 더하기 연산
		// 		 String을 int로 변경해주어야 함.
		double h = Integer.parseInt(height)*0.01;
		double w = Integer.parseInt(weight);
		
		double bmi = w / (h*h);
		
		// 출력 -> 모니터 화면에 보이고 싶음.
		System.out.println(bmi);
		JOptionPane.showMessageDialog(null, bmi);
	}
}
