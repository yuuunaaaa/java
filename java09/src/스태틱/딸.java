package 스태틱;

public class 딸 {
	String name;
	String gender;
	static int wallet = 10000;
	static int count = 0;
	
	public void tv보다() {
		System.out.println("tv를 본다");
	}

	public 딸(String name, String gender) {
		count++;
		wallet -= 1000;
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
}
