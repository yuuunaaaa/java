package 상속응용;

import 복습.CountThread;

public class PCmain {

	public static void main(String[] args) {
		CountThread count = new CountThread();
		TimerThread timer = new TimerThread();
		ImageThread image = new ImageThread();
		
		count.start();
		timer.start();
		image.start();
	}

}
