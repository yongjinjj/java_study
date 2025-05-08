package study.inherit.inherit04;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);	//기본타이어  금호/한국
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	/*
	KumhoTire frontLeftTire1 = new KumhoTire(null, 0);
	KumhoTire frontLeftTire2 = new KumhoTire(null, 0);
	KumhoTire frontLeftTire3 = new KumhoTire(null, 0);
	KumhoTire frontLeftTire4 = new KumhoTire(null, 0);
	
	HankookTire frontLeftTire11 = new HankookTire(null, 0);
	HankookTire frontLeftTire12 = new HankookTire(null, 0);
	HankookTire frontLeftTire13 = new HankookTire(null, 0);
	HankookTire frontLeftTire14 = new HankookTire(null, 0);
	*/
	
	

	// 생성자

	//int kumho_run() {
	//int hankook_run() {
	// 메소드
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
	
		if (frontRightTire.roll() == false) {
			stop();
			return 2;
		}
		
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		
		return 0;
	}

	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
}
