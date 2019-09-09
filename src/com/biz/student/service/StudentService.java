package com.biz.student.service;

import java.util.List;

import com.biz.score.service.ScoreService;
import com.biz.student.model.StudentVO;

public interface StudentService {
	public void input();
	public void input(int count);
	public void view();
	public List<StudentVO> getStudentList();
	public void setStudentList(List<StudentVO> studentList);
}
