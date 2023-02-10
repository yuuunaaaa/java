package 복습;import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class 배열만들기 {

	public static void main(String[] args) {
		// 1. 배열 만들기 - 이미 값을 알고 있는 경우
		String[] hobby = {"run", "book", "swim", "walk"};
		// hobby : 참조형 변수, 주소가 들어 있음
		System.out.println(hobby);
		System.out.println("0 : " + hobby[0]);
		System.out.println("1 : " + hobby[1]);
		System.out.println("length : " + hobby.length);
		System.out.println(hobby[3]);
		System.out.println(hobby[hobby.length-1]);
		// c타입의 for문
		for (int i = 0; i < hobby.length; i++) {
			// i ==> index의 역할, 0, 1, 2
			System.out.println(i + " : " + hobby[i]);
		}
		
		// for-each문 : 알아서 처음부터 인덱스를 하나씩 증가하면서
		//			      하나식 꺼내온다
		// 출력용!!
		// {"run", "book", "swim", "walk"}
		for (String x : hobby) {
			System.out.println(x);
		}
		
		// 2. 배열 만들기 - 값을 모르고 있는 경우, 공간부터 만들기
		String[] jobs = new String[5];
		System.out.println(jobs);
		jobs[0] = "백엔드 프로그래머";
		jobs[1] = "카페 주인";
		System.out.println(jobs[0]);
		System.out.println(jobs[1]);
		System.out.println(jobs[4]);
		System.out.println(jobs[jobs.length-1]);
		for (int i = 0; i < jobs.length; i++) {
			System.out.println(i + " : " + hobby[i]);
		}
		for(String x : jobs) {
			System.out.println(x);
		}
		
		// 배열 기본 확인 문제
		String[] travel = new String[5];
		char[] color = new char[5];
		double[] height = new double[5];
		
		travel[0] = "제주도";
		travel[1] = "일본";
		travel[2] = "강원도";
		travel[3] = "캐나다";
		travel[4] = "싱가포르";
		for (String t : travel) {
			System.out.println(t);
			
		}
		
		color[0] = 'b';
		color[1] = 's';
		color[2] = 'l';
		color[3] = 'n';
		color[4] = 'w';
		for (char c : color) {
			System.out.println(c);
		}
		
		height[0] = 188.5;
		height[1] = 185.5;
		height[2] = 182.5;
		height[3] = 183.5;
		height[4] = 181.5;
		
		for (double d : height) {
			System.out.println(d);
		}
		
		
		
	}

}
