package 생성자;

public class 수강신청 {
	String subject;
	String time;
	String name;
	
	public 수강신청(String subject, String time, String name) {
		super();
		this.subject = subject;
		this.time = time;
		this.name = name;
	}

	@Override
	public String toString() {
		return "수강신청 [subject=" + subject + ", time=" + time + ", name=" + name + "]";
	}
}
