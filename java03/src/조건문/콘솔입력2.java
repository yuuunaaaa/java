package 조건문;

import java.util.Scanner;

public class 콘솔입력2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 문제 1
		System.out.println("  나에 대한 정보");
		System.out.println("--------------------");
		
		System.out.print("이름 입력 >> ");
		String name = sc.next();
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.print("취미 입력 >> ");
		sc.nextLine();
		String hobby = sc.next();
		
		System.out.println("--------------------");
		System.out.println("나의 이름은 " + name);
		System.out.println("나의 나이는 " + age + "세");
		System.out.println("나의 취미는 " + hobby + "입니다.!");
		
		System.out.println("--------------------");
		
		// 문제 2
		System.out.print("나의 키는? ");
		double height = sc.nextDouble();
		System.out.print("나의 몸무게? ");
		double weight = sc.nextDouble();
		System.out.print("나는 저녁을 먹었나요? ");
		boolean dinner = sc.nextBoolean();
		System.out.print("나의 좌우명은? ");
		String motto = sc.nextLine();
		
		System.out.println("--------------------");
		System.out.println("나의 이름은 " + name + "입니다.");
		System.out.println("내 내년 나이는 " + (age + 1) + "입니다.");
		System.out.println("내 내년 키는 " + (height + 10) + "입니다.");
		System.out.println("내 내년 몸무게는 " + (weight + 1) + "입니다.");
		System.out.println("나는 저녁을 " + dinner + "했습니다.");
		System.out.println("나의 좌우명은 " + motto + "입니다.");
		System.out.println("--------------------");
		
		
		sc.close();
		
	}

}
