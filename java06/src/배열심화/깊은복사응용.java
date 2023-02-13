package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] 학기1성적 = { 44, 66, 22, 99, 100 };
		int[] 학기2성적 = 학기1성적.clone();
		System.out.println(학기1성적 == 학기2성적); // 주소 비교
		학기2성적[0] = 22;
		학기2성적[2] = 88;

		// 0) 전체 1학기, 2학기 성적 프린트
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기1성적[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] + " ");
		}
		int sameCnt = 0;
		int upCnt = 0;
		// 1) 1학기, 2학기 성적 중 동일한 성적 과목 수
		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				sameCnt++;
			} else if (학기1성적[i] < 학기2성적[i]) {
				upCnt++;
				System.out.println("\n1학기, 2학기 성적 중 오른 과목명 : " + 과목명[i]);
			}
		}
		System.out.println("1학기, 2학기 성적 중 동일한 성적 과목 수 : " + sameCnt);
		System.out.println("1학기, 2학기 성적 중 오른 과목 수 : " + upCnt);
	}

}
