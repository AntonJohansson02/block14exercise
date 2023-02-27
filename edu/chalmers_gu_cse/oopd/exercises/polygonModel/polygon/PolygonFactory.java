package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Niklas on 2016-02-19.
 */
public class PolygonFactory {
    private static final Point[] rectangleOffsets = {
            new Point(-20,-10),
            new Point(20,-10),
            new Point(20,10),
            new Point(-20,10)};
    private static final Point[] triangleOffsets = {
            new Point(0,-10),
            new Point(10,10),
            new Point(-10,10)};
    private static final Point[] squareOffsets = {
            new Point(-10,-10),
            new Point(10,-10),
            new Point(10,10),
            new Point(-10,10)};

    public static Polygon createRectangle(int x, int y){
        return createPolygon(x, y, rectangleOffsets);
    }
    public static Polygon createTriangle (int x, int y){
        return createPolygon(x, y, triangleOffsets );
    }
    public static Polygon createSquare   (int x, int y){
        return createPolygon(x, y, squareOffsets   );
    }

    // Private static helper methods
    private static Polygon createPolygon(int x, int y, Point[] offsets) {
        return new BasePolygon(basePoints(offsets)).translate(x,y);
    }
    private static List<Point> basePoints(Point[] offsets) {
        return Arrays.asList(offsets);
    }
}
