package 상속;

public class 영웅사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.name = "홍길동";
		p.age = 100;
		System.out.println(p);
		p.eat();

		맨 m = new 맨();
		m.run();
		
		수퍼맨 s = new 수퍼맨();
		s.name = "클라크";
		s.age = 25000;
		s.fly = true;
		s.eat();
		s.run();
		s.space();
		
		우먼 wm = new 우먼();
		wm.run();
		
		수퍼맨 w = new 수퍼맨();
		w.name = "원더우먼";
		w.age = 25000;
		w.fly = true;
		w.eat();
		w.run();
		w.space();
	}

}
