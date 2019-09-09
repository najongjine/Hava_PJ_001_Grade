package com.biz.student.service;

import java.util.List;

import com.biz.score.model.ScoreVO;
import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImp;
import com.biz.student.model.StudentVO;

public class StudentScore {
	List<StudentVO> studentS_Imp_List;
	List<ScoreVO> scoreS_Imp_List;
	StudentService student_S;
	ScoreService score_S;
	
	public StudentScore() {
		super();
		//studentS_Imp=new ArrayList<StudentServiceImp>();
		//scoreS_Imp=new ArrayList<ScoreServiceImp>();
		student_S=new StudentServiceImp();
		score_S=new ScoreServiceImp();
	
	}
	
	public void view(String strNum) {
		//studentS_Imp_List=student_S.getStudentList();
		//scoreS_Imp_List=score_S.getGradeList();
		//student_S.getStudentList().get(0).getStrStudentNum();
		/*for(StudentVO vo:student_S.getStudentList()) {
			if(strNum.equalsIgnoreCase(vo.getStrStudentNum())) {
				System.out.print(vo.getStrStudentNum()+"\t");
				System.out.print(vo.getStrName()+"\t");
			}
		}*/
		for(ScoreVO vo:score_S.getScoreList()) {
			if(strNum.equalsIgnoreCase(vo.getStrStudentNum())) {
				System.out.print(vo.getIntEng()+"\t");
				System.out.print(vo.getIntKor()+"\t");
				System.out.print(vo.getIntMath()+"\t");
				System.out.print(vo.getIntTotal()+"\t");
				System.out.print(vo.getIntAvg()+"\n");
			}
		}
	}
	
}
