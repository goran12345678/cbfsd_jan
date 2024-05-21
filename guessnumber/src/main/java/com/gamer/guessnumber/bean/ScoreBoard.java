package com.gamer.guessnumber.bean;

import java.io.Serializable;

public class ScoreBoard implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer score;

	public ScoreBoard() {
		// TODO Auto-generated constructor stub
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "ScoreBoard [score=" + score + "]";
	}

}
