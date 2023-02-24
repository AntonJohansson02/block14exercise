package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/* package-private */ class PolygonSet extends JComponent {
    private List<Polygon> polygons = new ArrayList<>();
    public void addPolygon(Polygon p){
        polygons.add(p);
    }

    public void paint(Graphics g){
        for (Polygon polygon : polygons) {
            polygon.paint(g);
        }
    }

    public void translate(int x, int y){
        /* Vår gamla kod, med muterbara shapes
        for (IPolygon p : polygons) {
            p.translate(x,y);
        }
         */
        // Vår nya kod, som använder mutate-by-copy
        List<Polygon> translated = new ArrayList<>();
        for (Polygon p : polygons) {
            Polygon q = p.translate(x,y);
            translated.add(q);
        }
        this.polygons = translated;
    }
}
