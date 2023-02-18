package 상속응용;

public class 동시프로그램실행2 {
	public static void main(String[] args) {
		$스레드 th1 = new $스레드();
		스레드2 th2 = new 스레드2();
		스레드3 th3 = new 스레드3();
		
		th1.start();
		th2.start();
		th3.start();
	}
}
