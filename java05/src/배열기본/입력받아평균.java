package 배열기본;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서
		// 저장공간에 넣고 싶을 때 ==> 배열을 사용!
		// 1. 배열을 만들어주세요
		int[] jumsu = new int[5];

		// 배열에 값을 넣을 때는 index가 필요 ==> i가 있는 for문 사용해야함
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("숫자 입력");
			// 숫자로 변환한 값을 배열의 할당 인덱스에 값으로 넣자
			jumsu[i] = Integer.parseInt(data);
		}
		for (int x : jumsu) {
			System.out.println(x + " ");
		}
		System.out.println();
		
		// 1. 전체 합계 구해서 평균 구하기
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		avg = sum / jumsu.length;
		System.out.println("평균 : " + avg);
		
		// 2. 300이상 되는 숫자만 찾아서, 합계를 구해보세요
		int sum2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				sum2 += jumsu[i];
			}
		}
		System.out.println(sum2);
		
		// 3. 심화문제, 300이상 되는 위치인 index를 프린트
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.println(i);
			}
		}
		
	}

}
