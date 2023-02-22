package 인터페이스;

public class 컴퓨터사용2 {
	// 익명클래스!!!
	// Computer com = new Computer();
	// 인터페이스는 불환전하기때문에 이것을 틀로 해서 객체 생성 불가능
	Computer com = new Computer() {
		
		@Override
		public void 용량이크다() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void 빠르다() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void 가볍다() {
			// TODO Auto-generated method stub
			
		}
	};
}
