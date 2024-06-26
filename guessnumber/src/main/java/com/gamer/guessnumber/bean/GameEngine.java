package com.gamer.guessnumber.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

public class GameEngine implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private	String title;
	private ScoreBoard scoreBoard;
	public GameEngine() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	public GameEngine(ScoreBoard scoreBoard) {
		this.scoreBoard = scoreBoard;
	}
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
