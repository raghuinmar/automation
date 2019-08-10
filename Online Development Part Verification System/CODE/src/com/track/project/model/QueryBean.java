package com.track.project.model;

import java.sql.Date;

public class QueryBean {
	private int queryid;
	private String queryDate;

    private String loginid;
    private String description;
    private String solution;
    private String status;
    private String solutionDate;
 
	
	
	public int getQueryid() {
		return queryid;
	}
	public void setQueryid(int queryid) {
		this.queryid = queryid;
	}
	public String getQueryDate() {
		return queryDate;
	}
	public void setQueryDate(String queryDate) {
		this.queryDate = queryDate;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSolution() {
		return solution;
	}
	public void setSolution(String solution) {
		this.solution = solution;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSolutionDate() {
		return solutionDate;
	}
	public void setSolutionDate(String solutionDate) {
		this.solutionDate = solutionDate;
	}
	
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
    
}
