package 메서드연습;

public class 계산기3 {
	// 계산기 3 이용
	// 1. 전체 손님 수를 반환 받아서 다음과 같이 프린트
	// 오늘 온 손님의 총 합은 9명입니다.
	// 2. 오전과 오후 손님수 차이는? 다음과 같이 프린트
	// 손님 수 차이는 1명입니다.
	// 3. 오전에 들어온 손님의 결제 금액은? 다음과 같이 프린트
	// 오전 결제금액은 35000원입니다.
	// 4. 오후에 들어온 손님의 결제 금액은? 다음과 같이 프린트
	// 오전 결제금액은 28000원입니다.
	// 5. 오전과 오푸에 들어온 손님의 총 결제 금액은? 다음과 같이 프린트
	// 오늘 하루 총 결제 금액은 63000원입니다.
	// 6. 5번에서 계산한 결제금액으로 1인당 결제금액을 계산해주세요. 다음과 같이 프린트
	// 1인당 결제 금액은 7000원입니다.
	public int add(int x, int y) { 
		return (x + y);
	}

	public int dif(int x, int y) { 
		return (x - y);
	}

	public int pay(int x, int y) {
		return (x * y);
	}

	public double div(int x, int y) {
		return (x / y);
	}
}
