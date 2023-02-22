package 인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer computer1 = new AppleComputer();
		BananaComputer computer2 = new BananaComputer();
		computer1.용량이크다();
		computer1.가볍다();
		computer1.빠르다();
		computer2.용량이크다();
		computer2.가볍다();
		computer2.빠르다();
	}

}
