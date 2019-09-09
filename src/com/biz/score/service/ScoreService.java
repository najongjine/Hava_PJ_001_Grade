package com.biz.score.service;

import java.util.List;

import com.biz.score.model.ScoreVO;

public interface ScoreService {
	public void input();
	public void input(int count);
	public void rank();
	public void sortToStudentNum();
	public void view();
	public List<ScoreVO> getScoreList();
	public void setScoreList(List<ScoreVO> gradeList);
}
