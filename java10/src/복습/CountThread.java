package 복습;

public class CountThread extends Thread{
	@Override
	public void run() {
		for (int i = 1; i < 500; i++) {
			System.out.println("카운트 >> " + i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println("cpu 연결 문제 생김.");
			}
		}
		
	}
}
