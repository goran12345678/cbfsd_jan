package com.gamer.guessnumber.bean;

import java.io.Serializable;

public class GameEngine implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private	String title;
	private ScoreBoard scoreBoard;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public ScoreBoard getScoreBoard() {
		return scoreBoard;
	}
	public void setScoreBoard(ScoreBoard scoreBoard) {
		this.scoreBoard = scoreBoard;
	}
}
