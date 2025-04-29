package study.practice.practice27;

public class Person {
	/*
	사람 클래스
	
	이름
	성별
	나이
	키
	몸무게
	직업
	혈액형
	건강상태
	수면중여부
	*/
	
	//필드
	//String name="익명";
	String name;
	//String gender="남";  // "남", "여"
	String gender;
	// '남', '여'
	// "남자", "여자"
	// 1, 2 
	int age;
	double height; // 179.6 -> 180  161.6
	double weight;
	String job; 
	String bloodType;//A B AB O
					 //1 2  3 4
	boolean isHealthy; //건강하냐?
					   //true false
	//0~10
	//0:사망 1:죽기직전 암 피곤하다 보통이다 괜찮은편이다 건강하다   10:컨디션베스트
	//int healthState;
	boolean isSleeping; //true false
	
	//생성자
	//생성자 선언하지 않으면? 기본생성자 자동 생성
	//Person(){}
	
	//생성자 : 객체가 생성될때 초기에 해야 할 일
	Person(){
		/*
		name = null;
		gender = "남"; //초기화 값
		age = 0;
		height = 0;
		weight = 0;
		job = "무직";   //null 직업무
		bloodType = null;
		isHealthy = true;  //초기화 값
		isSleeping = false;
		*/
	}
	
	Person (String name, String gender, int age, double height, double weight
				,String job, String bloodType, boolean isHealthy, boolean isSleeping) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.job = job;
		this.bloodType = bloodType;
		this.isHealthy = isHealthy;
		this.isSleeping = isSleeping;
	}
	
	//메소드
	void printPersonInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("직업 : " + job);
		System.out.println("혈액형 : " + bloodType);
		System.out.println("건강여부 : " + isHealthy);
		System.out.println("수면중여부 : " + isSleeping);
		System.out.println("수면중여부 : " + (isSleeping ? "자는중" : "안자는중" ));
		System.out.println();
		
	}

}
