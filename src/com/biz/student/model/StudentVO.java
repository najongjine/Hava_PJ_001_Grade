package com.biz.student.model;

import com.biz.score.model.ScoreVO;

public class StudentVO extends ScoreVO{
	private String strStudentNum;
	private String strName;
	private String strAddr;
	private String strTel;
	private String strDept;
	private int intGradeYear;
	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentVO(String strStudentNum, String strName, String strAddr, String strTel, String strDept,
			int intGradeYear) {
		super();
		this.strStudentNum = strStudentNum;
		this.strName = strName;
		this.strAddr = strAddr;
		this.strTel = strTel;
		this.strDept = strDept;
		this.intGradeYear = intGradeYear;
	}
	public String getStrStudentNum() {
		return strStudentNum;
	}
	public void setStrStudentNum(String strStudentNum) {
		this.strStudentNum = strStudentNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrAddr() {
		return strAddr;
	}
	public void setStrAddr(String strAddr) {
		this.strAddr = strAddr;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrDept() {
		return strDept;
	}
	public void setStrDept(String strDept) {
		this.strDept = strDept;
	}
	public int getIntGradeYear() {
		return intGradeYear;
	}
	public void setIntGradeYear(int intGradeYear) {
		this.intGradeYear = intGradeYear;
	}
	
		
}
