package com.epam.geometry.model;

public class Circle {
	
	private int radius;
	
	private int center;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getCenter() {
		return center;
	}

	public void setCenter(int center) {
		this.center = center;
	}
	
	public Circle() {}
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + center;
		result = prime * result + radius;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}			
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Circle other = (Circle) obj;
		if (center != other.center) {
			return false;
		}
		if (radius != other.radius) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Circle (radius = " + radius + ")";
	}

}
