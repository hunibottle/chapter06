package com.HF;

public abstract class Animal {
	//abstract 추상매소드가 하나라도 있으면 무조건 추상클래스가 되어야한다.
	
	private String picture;
	private String food;
	private String hunger;
	private String boundaries;
	private String location;
	// private 는 Animal Class 에서만 사용할 수 있지만 getter, setter를 이용하여 
	// 밖에서 사용이 가능하다. -> 상위 타입의 프라이빗 변수도 사용 가능하게 하는 것이 getter, setter이다.
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getHunger() {
		return hunger;
	}
	public void setHunger(String hunger) {
		this.hunger = hunger;
	}
	public String getBoundaries() {
		return boundaries;
	}
	public void setBoundaries(String boundaries) {
		this.boundaries = boundaries;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public abstract void makeNoise();
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("sleep");
	}
	public abstract void roam();

}
