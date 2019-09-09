package com.biz.exec;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImpV2;
import com.biz.student.service.StudentScore;
import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImp;

public class ScoreEx02 {

	public static void main(String[] args) {
		StudentService stService=new StudentServiceImp();
		ScoreService scService=new ScoreServiceImpV2();
		StudentScore studentScore=new StudentScore();
		
		stService.input();
		stService.view();
		
		scService.input(10);
		scService.rank();
		//scService.sortToStudentNum();
		scService.view();
		
		//studentScore.view("0001");

	}

}
