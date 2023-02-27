package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* package-private */ class PolygonSet implements Iterable<Polygon> {
    private List<Polygon> polygons = new ArrayList<>();
    public void addPolygon(Polygon p){
        polygons.add(p);
    }

    public void translate(int x, int y){
        List<Polygon> translated = new ArrayList<>();
        for (Polygon p : polygons) {
            Polygon q = p.translate(x,y);
            translated.add(q);
        }
        this.polygons = translated;
    }

    @Override
    public Iterator<Polygon> iterator() {
        return polygons.iterator();
    }
}
