package com.csc205.project2;

public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder() {
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }

    public Cylinder(double h, double r) {
        super();
        this.radius = r;
        this.height = h;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //surface area of cylinder =2 * PI * r * h + 2 * PI * r^2
    @Override
    public double surfaceArea() {
        return (2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2));

    }

    //volume of cylinder = PI * r^2 * h
    @Override
    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * height);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
