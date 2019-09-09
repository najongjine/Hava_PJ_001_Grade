package com.biz.score.service;

import java.util.Collections;
import java.util.Comparator;

import com.biz.score.model.ScoreVO;

public class ScoreServiceImpV2 extends ScoreServiceImp implements ScoreService {
	/*
	 * method내의 익명클래스를 사용한 보조연산
	 */
	public void rank() {
		Collections.sort(scoreList,new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				// TODO Auto-generated method stub
				return o2.getIntTotal() -o1.getIntTotal(); //(if(02>01)
				
			}
		});;
		
		int intRank=1;
		for(ScoreVO vo:scoreList) {
			vo.setIntRank(intRank++);
		}
		
		Collections.sort(scoreList,new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				// TODO Auto-generated method stub
				return Integer.valueOf(o2.getStrStudentNum()) - Integer.valueOf(o1.getStrStudentNum());
			}
		});;
	}
}
