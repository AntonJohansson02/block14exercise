package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Niklas on 2016-02-19.
 */
public class PolygonFactory {
    private static final int[][] rectangleOffsets = { {-20,-10}, {20,-10}, {20,10}, {-20,10}};
    private static final int[][] triangleOffsets = { {0,-10}, {10,10}, {-10,10}};
    private static final int[][] squareOffsets = { {-10,-10}, {10,-10}, {10,10}, {-10,10}};

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
    private static Polygon createPolygon(int x, int y, int[][] offsets) {
        return new BasePolygon(basePoints(offsets)).translate(x,y);
    }
    private static List<Point> basePoints(int[][] offsets) {
        List<Point> points = new ArrayList<>();
        for (int[] xy : offsets) {
            points.add(new Point(xy[0], xy[1]));
        }
        return points;
    }
}
