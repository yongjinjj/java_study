package study.practice.practice50;

import java.time.LocalDateTime;

import study.db.v3.ConvertDateUtil;

public class StudentDTO {
	int studno;
	String name;
	String id;
	int grade;
	String jumin;
	
	//LocalDateTime birthday;
	String birthday;
	String tel;
	int height;
	int weight;
	int deptno1; // 기본값 : 0  무조건 숫자다. 무조건 값을 가져야한다.
	//int deptno2; // 기본값:null, Nullable 값이 Null일수도 있다!
	Integer deptno2;
	//Integer -> int 타입의 Wrapper 클래스
	int profno;
	
	
	public int getStudno() {
		return studno;
	}
	public void setStudno(int studno) {
		this.studno = studno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDeptno1() {
		return deptno1;
	}
	public void setDeptno1(int deptno1) {
		this.deptno1 = deptno1;
	}
	public Integer getDeptno2() {
		return deptno2;
	}
	public void setDeptno2(Integer deptno2) {
		this.deptno2 = deptno2;
	}
	public int getProfno() {
		return profno;
	}
	public void setProfno(int profno) {
		this.profno = profno;
	}
	@Override
	public String toString() {
		//birthday를 LocalDateTime 타입으로 한 경우
		//ConvertDateUtil.convertLocalDateTimeToString(birthday);  
		return "StudentDTO [studno=" + studno + ", name=" + name + ", id=" + id + ", grade=" + grade + ", jumin="
				+ jumin + ", birthday=" + birthday + ", tel=" + tel + ", height=" + height + ", weight=" + weight
				+ ", deptno1=" + deptno1 + ", deptno2=" + deptno2 + ", profno=" + profno + "]";
	}
	
	
}
