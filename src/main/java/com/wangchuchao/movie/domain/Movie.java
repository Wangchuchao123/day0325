package com.wangchuchao.movie.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Movie {
	private int id;
	private String name;
	private String guideName;
	private Double price;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private Integer longtime;
	private String type;
	private Year year;
	private String area;
	private String state;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGuideName() {
		return guideName;
	}
	public void setGuideName(String guideName) {
		this.guideName = guideName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getLongtime() {
		return longtime;
	}
	public void setLongtime(Integer longtime) {
		this.longtime = longtime;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public Movie(int id, String name, String guideName, Double price, Date date, Integer longtime, String type,
			Year year, String area, String state) {
		super();
		this.id = id;
		this.name = name;
		this.guideName = guideName;
		this.price = price;
		this.date = date;
		this.longtime = longtime;
		this.type = type;
		this.year = year;
		this.area = area;
		this.state = state;
	}
	public Movie() {
		super();
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", guideName=" + guideName + ", price=" + price + ", date=" + date
				+ ", longtime=" + longtime + ", type=" + type + ", year=" + year + ", area=" + area + ", state=" + state
				+ "]";
	}
	
	
	
	
	
}
