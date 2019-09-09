package com.biz.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.student.model.StudentVO;

public class StudentServiceImp implements StudentService{
	String [] stdList=new String[]{
		"홍길동:서울특별시:010-111-1111:컴공과:3",
		"이몽룟:익산특별시:010-111-1121:전기과:2",
		"성춘동:남원시:010-111-1331:영어과:1",
		"문성동:광주시:010-111-1991:컴공과:3",
		"박종진:광주시:010-211-2111:컴공과:4"
	};

	static private List<StudentVO> studentList;
	private Scanner scan;
	private int count;
	
	public StudentServiceImp(List<StudentVO> studentList, int count) {
		super();
		this.studentList = studentList;
		this.count = count;
	}

	public StudentServiceImp() {
		super();
		count=1;
		studentList=new ArrayList<StudentVO>();
		scan=new Scanner(System.in);
	}
	
	
	public List<StudentVO> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentVO> studentList) {
		this.studentList = studentList;
	}

	@Override
	public void input() {
		for(int i=0;i<stdList.length;i++) {
			String[] stds=stdList[i].split(":");
			StudentVO vo=new StudentVO();
			vo.setStrStudentNum(String.format("%04d", this.count++));
			for(int j=0;j<stds.length;) {
				vo.setStrName(stds[j++]);
				vo.setStrAddr(stds[j++]);
				vo.setStrTel(stds[j++]);
				vo.setStrDept(stds[j++]);
				vo.setIntGradeYear(Integer.valueOf(stds[j++]) );
			}
			studentList.add(vo);
		}
		/* 키보드로 입력받기
		System.out.printf("-----------------%d 번 학생정보 입력-------------------\n",count);
		
		StudentVO studentVO=new StudentVO();
		studentVO.setStrStudentNum(String.format("%04d", this.count++));
		
		System.out.print("학생이름 > ");
		String _strName=scan.nextLine();
		
		System.out.print("학년 > ");
		String _strGradeYear=scan.nextLine();
		
		System.out.print("주소 > ");
		String _strAddr=scan.nextLine();
		
		System.out.print("학과 > ");
		String _strDept=scan.nextLine();
		
		System.out.print("전화번호 > ");
		String _strTel=scan.nextLine();
		
		System.out.println("--------------------------------------------------------");
		
		studentVO.setStrName(_strName);
		studentVO.setIntGradeYear(Integer.valueOf(_strGradeYear));
		studentVO.setStrAddr(_strAddr);
		studentVO.setStrDept(_strDept);
		studentVO.setStrTel(_strTel);
		studentList.add(studentVO); 키보드로 입력받기*/
	}

	@Override
	public void input(int count) {
		for(int i=0; i<count;i++) {
			input();
		}
	}

	@Override
	public void view() {
		System.out.println("\n학생명부");
		System.out.println("===========================================");
		System.out.println("학번\t이름\t학과\t학년\t전화번호\t주소");
		System.out.println("===========================================");
		for(StudentVO vo:studentList) {
			System.out.print(vo.getStrStudentNum()+"\t");
			System.out.print(vo.getStrName()+"\t");
			System.out.print(vo.getStrDept()+"\t");
			System.out.print(vo.getIntGradeYear()+"\t");
			System.out.print(vo.getStrTel()+"\t");
			System.out.print(vo.getStrAddr()+"\n");
		}
		System.out.println("===========================================");

	}

}
