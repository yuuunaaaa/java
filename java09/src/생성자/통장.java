package 생성자;

public class 통장 {
	String name; // 이름
	String ssString; // 주민번호
	int money; // 돈
	
	// 이름, 주민번호, 돈을 입력해야 통장을 만들 수 있게 할 것이다
	public 통장(String name, String ssString, int money) {
		this.name = name;
		this.ssString = ssString;
		this.money = money;
	}

	@Override
	public String toString() {
		return "통장 [name=" + name + ", ssString=" + ssString + ", money=" + money + "]";
	}
	
}
