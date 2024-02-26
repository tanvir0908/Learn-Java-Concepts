package com.example.challenge77.utils;

import com.example.challenge77.geometry.*;

public class Calculator {
    public static void main(String[] args) {
        Circle newCircle = new Circle(5.5);
        System.out.printf("Area of Circle: %f", newCircle.getAreaOfCircle());

        Rectangle newRectangle = new Rectangle(10, 5);
        System.out.printf("\nArea of Rectangle: %f", newRectangle.getAreaOfRectangle());
    }
}
