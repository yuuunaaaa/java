package 스태틱;

public class 직원 {
	String name;
	int age;
	String gender;
	static int count;
	static double avg;
	static int sum;
	
	// 객체 생성하지 않고 클래스 이름으로 바로 접근해서
	// 원할 때 평균을 구하고 싶은 경우 static 메서드로 만들기
	public static void getAvg() {
		System.out.println(sum / count);
	}
	
	public 직원(String name, int age, String gender) {
		count++;
		this.name = name;
		this.age = age;
		this.gender = gender;
		sum += age;
		avg = sum / count;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
