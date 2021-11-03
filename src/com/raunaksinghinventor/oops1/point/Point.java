package com.raunaksinghinventor.oops1.point;

public class Point {
    private int x,y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Distance between two points formula:
    // d(A,B)=√ (xB − xA) * (xB - xA) + (yB − yA) * (yB - yA)
    public double distance() {
        return Math.sqrt((this.x-0)*(this.x-0)+(this.y-0)*(this.y-0));
    }

    public double distance(int x, int y) {
        return Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y));
    }

    public double distance(Point p) {
        return Math.sqrt((this.x-p.getX())*(this.x-p.getX())+(this.y-p.getY())*(this.y-p.getY()));
    }
}
