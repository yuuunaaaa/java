package 복습;

import java.util.Scanner;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class 문제 {

	public static void main(String[] args) {
		// 문제 1
		Scanner sc = new Scanner(System.in);
		System.out.print("id 입력 ==> ");
		String id = sc.next();
		System.out.print("pw 입력 ==> ");
		int pw = sc.nextInt();
		
		if (id.equals("root") && pw == 1234) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		
		System.out.println("--------------------");
		
		// 문제 2
		System.out.print("사과 구매 갯수 입력 ==> ");
		int apple = sc.nextInt();
		System.out.print("사과 한 개당 가격 입력 ==> ");
		int apple_one = sc.nextInt();
		System.out.print("딸기 구매 갯구 입력 ==> ");
		int strawberry = sc.nextInt();
		System.out.print("딸기 한 개당 가격 입력 ==> ");
		int strawberry_one = sc.nextInt();
		
		int apple_price = apple * apple_one;
		int strawberry_price = strawberry * strawberry_one;
		int total = apple_price + strawberry_price;
		System.out.println("사과 구매 가격은 " + apple_price + "입니다.");
		System.out.println("딸기 구매 가격은 " + strawberry_price + "입니다.");
		System.out.println("전체 구매 가격은 " + total + "입니다.");

		System.out.println("--------------------");
		
		// 문제 3
		System.out.print("시작값 입력 ==> ");
		int start = sc.nextInt();
		System.out.print("종료값 입력 ==> ");
		int end = sc.nextInt();
		int sum = 0;
		
		for (int i = start; i <= end; i++) {
			sum = sum + i;
		}
		System.out.println("합 ==> " + sum);
		
		System.out.println("--------------------");
		
		
		// 문제 4
		System.out.print("시작값 입력 ==> ");
		int start2 = sc.nextInt();
		System.out.print("종료값 입력 ==> ");
		int end2 = sc.nextInt();
		System.out.print("점프값 입력 ==> ");
		int jump = sc.nextInt();
		int sum2 = 0;
		
		for (int i = start2; i <= end2; i += jump) {
			sum2 = sum2 + i;
			if (sum2 > 100) {
				break;
			}
			System.out.println(sum2);
		}
		
	}

}
