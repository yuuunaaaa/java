package 형변환;

import java.util.LinkedList;

public class 시험 {

	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println("전체 시험볼 과목 : " + test);
		
		for (int i = 1; i <= test.size() + 1; i++) {
			test.remove();
			System.out.println(i + "일차 시험본 후 남은 과목  : " + test);
		}
		

	}

}
