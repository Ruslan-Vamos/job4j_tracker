package ru.job4j.oop;

import static java.lang.Math.*;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point another) {
        return sqrt(pow(another.x - this.x, 2) + pow(another.y - this.y, 2));
    }
}
