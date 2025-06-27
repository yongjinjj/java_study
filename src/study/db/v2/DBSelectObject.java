package study.db.v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DBSelectObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//findDept();
		//findDeptSingle();
		
//		findDeptByDeptno(10);
		Dept dept = findDeptByDeptno(10);
		if(dept == null) {
			System.out.println("조회된 데이터가 없다!");
		}
		
		if(dept != null) {
			System.out.println(dept.getDeptno() + " " + dept.getDname() + " " + dept.getLoc());
		}
		
		
		System.out.println("*********** findDeptList() ***************");
		List<Dept> deptList = findDeptList();
		if(deptList == null)
			System.out.println("리스트가 없다 = 데이터가 없다");
		
		if(deptList.size() == 0)
			System.out.println("리스트가 비어있다");
		
		if(deptList != null) {
			
			for(Dept d : deptList) {
				System.out.println(d.getDeptno() + " " + d.getDname() + " " + d.getLoc());
			}
			
//			for(int i=0; i<deptList.size(); i++) {
//				Dept d = deptList.get(i);
//			}
			
		}
		
		System.out.println("*********** findDeptByDname() ***************");
		Dept dept2 = findDeptByDname("RESEARCH");
		if(dept2 != null) {
			System.out.println(dept2.getDeptno() + " " + dept2.getDname() + " " + dept2.getLoc());
		}
		
//		findDeptByDeptno(30);
//		findDeptByDeptno(40);
		
		System.out.println("*********** findDeptListAs() ***************");
		deptList = findDeptListAs();
		for(Dept d : deptList) {
			System.out.println(d.getDeptno() + " " + d.getDname() + " " + d.getLoc());
		}
		
	}

	
	public static void findDept() {


		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "select * from dept";

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false

				// 컬럼인덱스 / 컬럼명
				// rs.getInt(1)

				// 해당 행에 컬럼 단위로 데이터 접근
				System.out.println(rs.getInt("DEPTNO"));
				System.out.println(rs.getString("DNAME"));
				System.out.println(rs.getString("LOC"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
	}
	
	public static void findDeptSingle() {
		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "select * from dept where deptno = 30 ";

		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			if(rs.next()) { // 읽어올 데이터가 1개만 있는 경우?
				// 해당 행에 컬럼 단위로 데이터 접근
				System.out.println(rs.getInt("DEPTNO"));
				System.out.println(rs.getString("DNAME"));
				System.out.println(rs.getString("LOC"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
	}
	
	public static Dept findDeptByDeptno(int deptno) {

		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "select * from dept where deptno = ? ";		
		
		Dept dept = null; 
		
		try {
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			 
			//파라미터 세팅
			psmt.setInt(1, deptno); //쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			if(rs.next()) { // 읽어올 데이터가 1개만 있는 경우?
				dept = new Dept();
				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return dept;

	}
	
	public static Dept findDeptByDname(String dname) {

		

		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비

		String query = "select * from dept where dname = ? ";		

		
		Dept dept = null; 
		
		try {

			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			 
			//파라미터 세팅
			psmt.setString(1, dname); //쿼리에 있는 첫번째 ? 위치에 deptno 를 세팅하겠다
			
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장

			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			if(rs.next()) { // 읽어올 데이터가 1개만 있는 경우?
				
				dept = new Dept();
				
				dept.setDeptno(rs.getInt("DEPTNO"));
				dept.setDname(rs.getString("DNAME"));
				dept.setLoc(rs.getString("LOC"));
				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		
		return dept;
	}
	
	//findDeptAll
	public static List<Dept> findDeptList() {   


		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "select * from dept where 1=2";

		//List<Dept> deptList = null;
		List<Dept> deptList = new ArrayList<Dept>();
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
			
			// ResultSet rs 에 담겨져있는 쿼리 수행결과 확인
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// rs.next() 다음 불러올 행 데이터가 있으면 true, 없으면 false

				// 컬럼인덱스 / 컬럼명
				// rs.getInt(1)
				
//				if(deptList == null)
//					deptList = new ArrayList<Dept>();
				
				// 해당 행에 컬럼 단위로 데이터 접근
				Dept dept = new Dept(rs.getInt("DEPTNO"), rs.getString("DNAME"), rs.getString("LOC"));
				deptList.add(dept);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return deptList;
	}
	
	public static List<Dept> findDeptListAs() {   

		// DB연결 및 사용시 필요한 객체
		Connection conn = null; // DB 연결 객체
		PreparedStatement psmt = null; // DB 연결후, sql 명령 실행해주는 객체
		ResultSet rs = null; // sql Select 실행 후 조회 결과가 저장되는 객체

		conn = DBConnectionManager.connectDB();

		// 쿼리 준비
		String query = "select deptno dpno, dname dnme from dept";

		//List<Dept> deptList = null;
		List<Dept> deptList = new ArrayList<Dept>();
		
		try {
			
			psmt = conn.prepareStatement(query); // 쿼리실행 준비객체
			rs = psmt.executeQuery(); // 쿼리 실행 후 결과 저장
			
			while (rs.next()) { // 읽어온 데이터를 행 단위로 반복하면서 접근
				// 해당 행에 컬럼 단위로 데이터 접근
				//Dept dept = new Dept(rs.getInt("DEPTNO"), rs.getString("DNAME"), null);
				Dept dept = new Dept(rs.getInt("dpno"), rs.getString("dnme"), null);
				deptList.add(dept);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		DBConnectionManager.disconnectDB(conn, psmt, rs);
		
		return deptList;
	}
	
}

















