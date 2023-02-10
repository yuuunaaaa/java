package 배열응용;

import java.util.Scanner;

public class 문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] java = new String[3];
		int[] num = new int[5];
		System.out.println("정수 5개를 입력하세요");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int n4 = sc.nextInt();
		int n5 = sc.nextInt();
		
		num[0] = n1;
		num[1] = n2;
		num[2] = n3;
		num[3] = n4;
		num[4] = n5;
		
		System.out.println("첫번째 값과 세번째 값을 더한 결과 ==> " + (num[0] + num[2]));

		System.out.println("3단어를 입력하세요");
		
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		
		java[0] = s1;
		java[1] = s2;
		java[2] = s3;
		
		System.out.println(java[0] + " 보다는 " + java[1]);
		sc.close();
	}
}
