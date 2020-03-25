package com.wangchuchao.movie.domain;

public class Year {
	private int yid;
	private String yname;
	public int getYid() {
		return yid;
	}
	public void setYid(int yid) {
		this.yid = yid;
	}
	public String getYname() {
		return yname;
	}
	public void setYname(String yname) {
		this.yname = yname;
	}
	public Year(int yid, String yname) {
		super();
		this.yid = yid;
		this.yname = yname;
	}
	@Override
	public String toString() {
		return "Year [yid=" + yid + ", yname=" + yname + "]";
	}
	public Year() {
		super();
	}
	
	
}
