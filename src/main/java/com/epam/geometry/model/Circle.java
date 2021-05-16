package com.epam.geometry.model;

import java.util.Objects;

public class Circle{

    float radius;
    Point centre;


    public Circle(float x, float y, float radius) {
        centre = new Point(x,y);
        if (radius < 0){
            throw new IllegalArgumentException("radius is negative");
        }
        this.radius = radius;
    }
    public Circle() {}


    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Float.compare(circle.radius, radius) == 0 &&
                Objects.equals(centre, circle.centre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, centre);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centre=" + centre +
                '}';
    }
}
