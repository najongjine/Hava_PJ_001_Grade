package com.biz.student.service;

import java.util.List;

import com.biz.score.model.ScoreVO;
import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImp;
import com.biz.student.model.StudentVO;

public class StudentScore {

	StudentService student_S;
	ScoreService score_S;
	
	public StudentScore() {
		super();

		student_S=new StudentServiceImp();
		score_S=new ScoreServiceImp();
	
	}
	
	public void view(String strNum) {
		System.out.printf("---------------%s 학번의 정보-----------------------------\n",strNum);
		System.out.println("학번\t이름\t영어\t국어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------");
		for(StudentVO vo:student_S.getStudentList()) {
			if(strNum.equalsIgnoreCase(vo.getStrStudentNum())) {
				System.out.print(vo.getStrStudentNum()+"\t");
				System.out.print(vo.getStrName()+"\t");
			}
		}
		for(ScoreVO vo:score_S.getScoreList()) {
			if(strNum.equalsIgnoreCase(vo.getStrStudentNum())) {
				System.out.print(vo.getIntEng()+"\t");
				System.out.print(vo.getIntKor()+"\t");
				System.out.print(vo.getIntMath()+"\t");
				System.out.print(vo.getIntTotal()+"\t");
				System.out.print(vo.getIntAvg()+"\n");
				
			}
		}
		System.out.println("--------------------------------------------------------");
	}
	
}
