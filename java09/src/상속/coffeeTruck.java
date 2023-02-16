package 상속;

public class coffeeTruck extends truck{
	boolean coffee = true;
	
	public void sell() {
		speed();
		System.out.println("커피트럭의 색은 " + color);
		System.out.println("커피를 팔다~");
	}
	
	public void customer() {
		System.out.println("손님이 많다~");
	}

	@Override
	public String toString() {
		return "coffeeTruck [coffee=" + coffee + ", fuelEfficiency=" + fuelEfficiency + ", color=" + color + ", age="
				+ age + "]";
	}
}
