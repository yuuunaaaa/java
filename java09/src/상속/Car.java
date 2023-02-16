package 상속;

public class Car {
	String color;
	int age;
	
	public void speed() {
		System.out.println("속도가 빠르다");
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", age=" + age + "]";
	}
}
