package com.track.project.model;

public class ProjModuleBean {
	private int projid;
	private int mid;
	private String mname;
	private String projname;
	private String projcode;
	private String subtaskname;
	private String ehrs;
	public String getEhrs() {
		return ehrs;
	}
	public void setEhrs(String ehrs) {
		this.ehrs = ehrs;
	}
	public String getSubtaskname() {
		return subtaskname;
	}
	public void setSubtaskname(String subtaskname) {
		this.subtaskname = subtaskname;
	}
	public String getProjname() {
		return projname;
	}
	public void setProjname(String projname) {
		this.projname = projname;
	}
	public String getProjcode() {
		return projcode;
	}
	public void setProjcode(String projcode) {
		this.projcode = projcode;
	}
	public int getProjid() {
		return projid;
	}
	public void setProjid(int projid) {
		this.projid = projid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}

}
