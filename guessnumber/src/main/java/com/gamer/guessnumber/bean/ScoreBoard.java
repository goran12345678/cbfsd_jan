package com.gamer.guessnumber.bean;

public class ScoreBoard {
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
