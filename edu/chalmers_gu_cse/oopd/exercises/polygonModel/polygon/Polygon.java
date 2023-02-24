package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;

public interface Polygon {
    Polygon translate(int x, int y);
    Polygon rotate(double radians);
    Polygon scale(double x, double y);

    Point getCenterPoint();

    // Still an issue with MVC!!
    void paint(Graphics g);

}
