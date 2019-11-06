package ru.job4j.condition;

public class Point {
    private int x;
    private int y;
    private int z;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        Point a3d = new Point(0, 0, 1);
        Point b3d = new Point(0, 2, 1);
        System.out.println(" Distance is " + b.distance(a));
        System.out.println(" Distance3d is " + b3d.distance3d(a3d));
    }
    public double distance(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
    }
    public double distance3d(Point that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2) + Math.pow(this.z - that.z, 2));
    }

}
