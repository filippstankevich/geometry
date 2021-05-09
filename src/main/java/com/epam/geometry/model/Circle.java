package com.epam.geometry.model;

public class Circle {
	
	private double radius;
	
	//private double center;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	/*public double getCenter() {
		return center;
	}

	public void setCenter(int center) {
		this.center = center;
	}*/
	
	public Circle() {}
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Circle (radius = " + radius + ")";
	}

}
