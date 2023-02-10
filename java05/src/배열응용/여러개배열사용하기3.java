package 배열응용;

import java.util.Scanner;

public class 여러개배열사용하기3 {
	public static void main(String[] args) {
		String[] year1 = new String[3];
		String[] year2 = new String[3];
		Scanner sc = new Scanner(System.in);

		System.out.println("작년에 가고 싶었던 세곳을 입력하시오");
		year1[0] = sc.next();
		year1[1] = sc.next();
		year1[2] = sc.next();

		System.out.println("올해 가고 싶었던 세곳을 입력하시오");
		year2[0] = sc.next();
		year2[1] = sc.next();
		year2[2] = sc.next();

		int cnt = 0;

		for (int i = 0; i < year2.length; i++) {
			if (year1[i].equals(year2[i])) {
				cnt++;
			}
		}
		System.out.println("작년과 올해 가고 싶은 곳과 우선순위가 동일한 곳은 " + cnt + "곳입니다.");
	sc.close();
	}
}
