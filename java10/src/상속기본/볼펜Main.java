package 상속기본;

public class 볼펜Main {

	public static void main(String[] args) {
		볼펜 p = new 볼펜();
		p.price = 2000;
		p.company = "signo";
		p.thickness = 0.38;
		p.buy();
		p.write();
		System.out.println(p);
	}
}
