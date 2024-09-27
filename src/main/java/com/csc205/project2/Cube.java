package com.csc205.project2;

public class Cube extends Shape {

    private double width;

    public Cube(){
        super();
        this.width = 0;
    }

    public Cube(double w){
        super();
        this.width = w;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double w){
        this.width = w;
    }

    //surface area of cube = 6 * width^2
    @Override
    public double surfaceArea() {
        return (6 * Math.pow(width, 2));
    }

    //volume of cube = width^3
    @Override
    public double volume() {
        return (Math.pow(width, 3));
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
