package study.practice.practice28;

public class Monitor {
	//필드
	int inch; 	//인치
	String company; //제조사
	String model; //모델명
	
	//생성자
	Monitor(int inch, String company, String model){
		this.inch = inch;
		this.company = company;
		this.model = model;
	}
	
//	Monitor(){}

	//메소드
	void printInfo(){
//		System.out.println(inch);
//		System.out.println(company);
//		System.out.println(model);
		System.out.printf("제조사:%s 모델명:%s 인치:%d인치\n", company, model, inch);
	}
}