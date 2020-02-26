package com.bawei.vo;

import com.bawei.entity.Movie;
//视图对象 用来接收ui  前台传递的参数
public class MovieVO extends Movie{
	
	private Double p1;//开始价格
	private Double p2;//结束价格
	
	private Integer l1;//开始时长
	private Integer l2;//结束时长
	
	private String t1;//开始上映时间
	private String t2;//结束上映时间
	
	private String name;
	
	private Integer pageNum;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Double getP1() {
		return p1;
	}
	public void setP1(Double p1) {
		this.p1 = p1;
	}
	public Double getP2() {
		return p2;
	}
	public void setP2(Double p2) {
		this.p2 = p2;
	}
	public Integer getL1() {
		return l1;
	}
	public void setL1(Integer l1) {
		this.l1 = l1;
	}
	public Integer getL2() {
		return l2;
	}
	public void setL2(Integer l2) {
		this.l2 = l2;
	}
	public String getT1() {
		return t1;
	}
	public void setT1(String t1) {
		this.t1 = t1;
	}
	public String getT2() {
		return t2;
	}
	public void setT2(String t2) {
		this.t2 = t2;
	}
	@Override
	public String toString() {
		return "MovieVO [p1=" + p1 + ", p2=" + p2 + ", l1=" + l1 + ", l2=" + l2 + ", t1=" + t1 + ", t2=" + t2
				+ ", name=" + name + ", pageNum=" + pageNum + "]";
	}
	public MovieVO(Integer id, String name, String actor, Double price, String uptime, Integer longtime, String type,
			String area, Integer years, Integer status, Double p1, Double p2, Integer l1, Integer l2, String t1,
			String t2, String name2, Integer pageNum) {
		super(id, name, actor, price, uptime, longtime, type, area, years, status);
		this.p1 = p1;
		this.p2 = p2;
		this.l1 = l1;
		this.l2 = l2;
		this.t1 = t1;
		this.t2 = t2;
		name = name2;
		this.pageNum = pageNum;
	}
	public MovieVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MovieVO(Integer id, String name, String actor, Double price, String uptime, Integer longtime, String type,
			String area, Integer years, Integer status) {
		super(id, name, actor, price, uptime, longtime, type, area, years, status);
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
