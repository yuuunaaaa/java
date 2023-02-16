package 상속;

public class 원더우먼 extends 우먼{
	boolean fly;
	
	public void space() {
		System.out.println("이름은 " + name);
		System.out.println("우주에서 순간이동을 한다");
	}
	
	@Override
	public void eat() {
		System.out.println("생각보다 많이 먹다~~");
	}

	@Override
	public String toString() {
		return "원더우먼 [fly=" + fly + ", power=" + power + ", name=" + name + ", age=" + age + "]";
	}
}
