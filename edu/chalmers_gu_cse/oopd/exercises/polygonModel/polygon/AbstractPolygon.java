package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Niklas on 2016-02-29.
 */
abstract class AbstractPolygon extends JComponent implements Polygon {
    // This violates MVC - we want this code to be part of the view2d packages!
    // We still don't have the knowledge to fix it though, so be patient.
    public void paint(Graphics g){
        java.util.List<Point> corners = getPoints();
        // first and last point should be the same
        corners.add(corners.get(0));
        Point from = null;
        for (Point to : corners){
            if (from != null){
                g.drawLine(from.x, from.y, to.x, to.y);
            }
            from = to;
        }
    }

    protected abstract List<Point> getPoints();

    @Override
    public abstract AbstractPolygon translate(int x, int y);
    @Override
    public abstract AbstractPolygon rotate(double radians);
    @Override
    public abstract AbstractPolygon scale(double x, double y);
}
