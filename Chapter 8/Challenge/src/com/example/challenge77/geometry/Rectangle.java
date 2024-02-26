package com.example.challenge77.geometry;

public class Rectangle {
    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getAreaOfRectangle() {
        return (height * width);
    }
}
