package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = { "홍길동", "이순신", "뉴진스", "방탄", "블랙핑크" };
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 88, 80, 70 };
		int ans1 = 0;
		int ans2 = 0;
		int ans3 = 0;
		int sum1 = 0;
		int sum2 = 0;
		double avg1 = 0;
		double avg2 = 0;

		for (int i = 0; i < term2.length; i++) {
			// 1. 1학기 성적이 오른 학생 몇명?
			if (term1[i] < term2[i]) {
				ans1++;
			}
			// 2. 1학기, 2학기 성적이 동일한 학생 몇명?
			else if (term1[i] == term2[i]) {
				ans2++;
			} 
			// 3. 2학기 학생 중 만점(100)인 학생의 이름과 번호는?
			if (term2[i] == 100) {
				System.out.println("2학기 학생 중 만점(100)인 학생의 이름과 번호 > " + names[i] + "\t" + i);
			}
			sum1 += term1[i];
			sum2 += term2[i];
			
			// 5. 심화) 뉴진스의 1학기 성적, 2학기 성적은?
			if(names[i].equals("뉴진스")) {
				System.out.println("뉴진스의 1학기 성적 > " + term1[i]);
				System.out.println("뉴진스의 2학기 성적 > " + term2[i]);
			}
		}
		System.out.println("1학기 성적이 오른 학생 > " + ans1 + "명");
		System.out.println("1학기, 2학기 성적이 동일한 학생 > " + ans2 + "명");
		
		// 4. 1학기 성적의 평균과 2학기 성적의 평균 중 누가 더 높았나요?
		avg1 = (double)sum1 / term1.length;
		avg2 = (double)sum1 / term2.length;
		
		if (avg1 > avg2) {
			System.out.println("1학기 성적이 더 높습니다.");
		} else {
			System.out.println("2학기 성적이 더 높습니다.");
		}
	}
}