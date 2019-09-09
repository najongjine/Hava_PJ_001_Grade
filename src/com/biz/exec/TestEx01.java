package com.biz.exec;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ScoreServiceImp;
import com.biz.student.service.StudentScore;
import com.biz.student.service.StudentService;
import com.biz.student.service.StudentServiceImp;

public class TestEx01 {

	public static void main(String[] args) {
		StudentService stService=new StudentServiceImp();
		ScoreService scService=new ScoreServiceImp();
		StudentScore studentScore=new StudentScore();
		
		stService.input();
		stService.view();
		
		scService.input(5);
		scService.rank();
		scService.sortToStudentNum();
		scService.view();
		
		studentScore.view("0001");
	}

}
