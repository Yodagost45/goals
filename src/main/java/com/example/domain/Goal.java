package com.example.domain;

import java.sql.Date;

public class Goal {
	private int goal_id;
	private int goal_section_id;
	private String title;
	private String details;
	private Date dealine;
	private String reward;
	private String penalty;
	private String pub; //short for public
	private int recurs;
	private boolean completed;
	
	public int getGoal_id() {
		return goal_id;
	}
	public void setGoal_id(int goal_id) {
		this.goal_id = goal_id;
	}
	public int getGoal_section_id() {
		return goal_section_id;
	}
	public void setGoal_section_id(int goal_section_id) {
		this.goal_section_id = goal_section_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getDealine() {
		return dealine;
	}
	public void setDealine(Date dealine) {
		this.dealine = dealine;
	}
	public String getReward() {
		return reward;
	}
	public void setReward(String reward) {
		this.reward = reward;
	}
	public String getPenalty() {
		return penalty;
	}
	public void setPenalty(String penalty) {
		this.penalty = penalty;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	public int getRecurs() {
		return recurs;
	}
	public void setRecurs(int recurs) {
		this.recurs = recurs;
	}
	public boolean isCompleted() {
		return completed;
	}
	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
}
