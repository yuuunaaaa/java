package 배열복습;

import java.util.Random;

public class 배열비교 {
	public static void main(String[] args) {
		// 입력 : 많은 양의 저장공간(배열, 2개)
		// 배열 하나당 990개의 저장공간 필요
		// => 실제 생성된 저장공간 개수 (990 + 1 + 1) * 2
		// 랜덤으로 데이터를 입력(Random)
		// 반복문으로 배열 위치(인덱스)를 옮기면서 데이터를 넣자.

		int[] ans = new int[990];
		int[] myAns = new int[990];

//		System.out.println(ans.length);
//		System.out.println(myAns.length);
//		System.out.println(ans);
//		System.out.println(myAns);

		Random r = new Random(42);
		for (int i = 0; i < myAns.length; i++) {
			ans[i] = r.nextInt(4) + 1; // 0~3 ==> 1~4
			myAns[i] = r.nextInt(4) + 1; // 0~3 ==> 1~4
		}

		// 확인!!
		System.out.println("번호\t:\t답안\t\t내답");
		for (int i = 0; i < myAns.length; i++) {
			System.out.println((i+1) + "\t:\t" + ans[i] + "\t<->\t" + myAns[i]);
		}
		// 처리
		// 두 배열의 같은 인덱스가 같은 문항을 비교!!
		// 동일하면 1점씩 획득
		int jumsu = 0;
		for (int i = 0; i < myAns.length; i++) {
			if (ans[i] == myAns[i]) {
				jumsu++;
			}
		}
		
		// 출력
		System.out.println("토익 점수 : " + jumsu + "점");
	}
}
