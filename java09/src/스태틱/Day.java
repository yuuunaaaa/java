package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int count;
	static int sum;
	
	public Day(String doing, int time, String location) {
		// new로 부품을 만드는 것(객체 생성)
		// 객체생성할 때마다 꼭 처리하고 싶은 내용이 있으면
		// 생성자 메서드 내에서 써주세요
		// 객체생성할 대 생성자 메서드가 자동호출되기 대문에 무조건 처리해줌
		count++;
		sum += time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}