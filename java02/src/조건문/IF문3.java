package 조건문;

public class IF문3 {
	public static void main(String[] args) {
		
		// 문제 1
		int myNum = 99;
		
		if (myNum >= 80) {
			System.out.println("최우수");
		} else if (myNum >= 70 && myNum <= 79) {
			System.out.println("우수");
		} else if (myNum >= 60 && myNum <= 69) {
			System.out.println("우수");
		} else {
			System.out.println("미달");
		}
		
		// 문제 2
		int myTour = 10;
		
		switch (myTour) {
		case 6:
			System.out.println("VIP");
			break;
		case 10:
			System.out.println("VVIP");
			break;
		default:
			System.out.println("Normal");
		}
	}
}
