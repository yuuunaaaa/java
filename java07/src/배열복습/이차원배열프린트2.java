package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		// 꼭 하고 싶은 것 9가지를 작성해서, 전체 프린트                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
		String[][] s = {
				{"여행","맛있는 음식","놀기"},
				{"잠자기","옷사기","공부"},
				{"운동","휴식","다이어리"}
				};
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s.length; j++) {
				System.out.println(s[i][j]);
				
			}
		}
	}

}
