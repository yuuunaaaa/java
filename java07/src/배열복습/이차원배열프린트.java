package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		// 배열을 만들 때 이미 알고 있는 경우
		int[][] n1 = {
				{1, 2, 3},
				{4, 5, 6}
		};
		System.out.println(n1.length); // 2차원 배열의 length(행)
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]);
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				System.out.println(n1[i][j]);
			}
		}
		
		// 배열을 만들 때 아직 모르고 있는 경우, 공간을 먼저 만든다.
		int[][] n2 = new int[2][3];
	}

}
