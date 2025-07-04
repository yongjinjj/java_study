package study.practice.practice34;

public class AccountMain {

	public static void main(String[] args) {
		// 객체 생성
		Account a = new Account("123-45", 10000);
		Account b = new Account("567-89", 10000);

		// 결과 출력
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		// 송금: 3천원씩 a 계좌에서 -> b계좌로!
		boolean result = true;
		while (result) {
			result = a.transfer(b, 3000);
		}

		// 결과 출력
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		b.transfer(a, 5000);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}

}
