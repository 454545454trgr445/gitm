package com.example.demo.utils;

public class Searchinfo {

	private boolean canpage=true;
	
	public boolean isCanpage() {
		return canpage;
	}
	public void setCanpage(boolean canpage) {
		this.canpage = canpage;
	}
	private int pageno=1;
	private int maxrow=3;
	private String where;
	private String search;
	public int getPageno() {
		return pageno;
	}
	public void setPageno(int pageno) {
		this.pageno = pageno;
	}
	public int getMaxrow() {
		return maxrow;
	}
	public void setMaxrow(int maxrow) {
		this.maxrow = maxrow;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	public String getlimit() {
		if(!canpage) return "";
		if(pageno>0) {
			return " limit "+(pageno-1)*maxrow+","+maxrow;
		}
		return "";
	}
	public String getWhere() {
		if(!canpage) return "";
		return where;
	}
	public void setWhere(String where) {
		this.where = where;
	}
	
	public Searchinfo() {
		// TODO Auto-generated constructor stub
	}
	public Searchinfo(boolean canpage) {
		super();
		this.canpage = canpage;
	}
	
	
	
	
}
