package com.example.challenge77.geometry;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getAreaOfCircle() {
        return Math.PI * Math.pow(radius, 2);
    }
}
