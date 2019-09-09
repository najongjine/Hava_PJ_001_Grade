package com.biz.score.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.biz.score.model.ScoreVO;

public class ScoreServiceImp implements ScoreService {
	List<ScoreVO> scoreList;
	int count;
	
	public ScoreServiceImp(List<ScoreVO> scoreList) {
		super();
		this.scoreList = scoreList;
	}

	public ScoreServiceImp() {
		super();
		count=1;
		scoreList=new ArrayList<ScoreVO>();
	}
	

	public List<ScoreVO> getscoreList() {
		return scoreList;
	}

	public void setscoreList(List<ScoreVO> scoreList) {
		this.scoreList = scoreList;
	}

	@Override
	public void input() {
		
		ScoreVO _gradeVO=new ScoreVO();
		Random rnd=new Random();
		_gradeVO.setStrStudentNum(String.format("%04d", count++));
		_gradeVO.setIntEng(rnd.nextInt(100)+51);
		_gradeVO.setIntKor(rnd.nextInt(100)+51);
		_gradeVO.setIntMath(rnd.nextInt(100)+51);
		_gradeVO.setIntTotal(_gradeVO.getIntEng()+_gradeVO.getIntKor()+_gradeVO.getIntMath());
		_gradeVO.setIntAvg(_gradeVO.getIntTotal()/3);
		
		scoreList.add(_gradeVO);
	}

	@Override
	public void input(int count) {
		for(int i=0; i<count; i++) {
			input();
		}

	}
	
	public void rank() {
		int size=scoreList.size();
		ScoreVO _vo=new ScoreVO();

		for(int i=0;i<size-1;i++) {
			for(int j=i+1; j<size;j++) {
				if(scoreList.get(i).getIntTotal()>scoreList.get(j).getIntTotal()) {
					_vo=scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, _vo);
				}
			}
		}

		int rank=1;
		for(ScoreVO vo:scoreList) {
			vo.setIntRank(rank++);
		}
	}
	public void sortToStudentNum() {
		int size=scoreList.size();
		ScoreVO _vo=new ScoreVO();

		for(int i=0;i<size-1;i++) {
			for(int j=i+1; j<size;j++) {
				if(Integer.valueOf(scoreList.get(i).getStrStudentNum())>
				Integer.valueOf(scoreList.get(j).getStrStudentNum())) {
					_vo=scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, _vo);
				}
			}
		}
	}

	@Override
	public void view() {
		System.out.println("\n점수표");
		System.out.println("===========================================");
		System.out.println("학번\t국어\t영어\t수학\t충점\t평균\t석차");
		System.out.println("===========================================");
		
		for(ScoreVO vo:scoreList) {
			System.out.print(vo.getStrStudentNum()+"\t");
			System.out.print(vo.getIntKor()+"\t");
			System.out.print(vo.getIntEng()+"\t");
			System.out.print(vo.getIntMath()+"\t");
			System.out.print(vo.getIntTotal()+"\t");
			System.out.print(vo.getIntAvg()+"\t");
			System.out.print(vo.getIntRank()+"\n");
		}
		System.out.println("============================================");

	}

	public List<ScoreVO> getScoreList() {
		return scoreList;
	}

	public void setScoreList(List<ScoreVO> scoreList) {
		this.scoreList = scoreList;
	}



}
