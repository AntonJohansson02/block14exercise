package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Niklas on 2016-02-21.
 *
 * A PolygonModel combines the functionality of a PolygonSet, that
 * can be updated with new polygons; and a PolygonSetAnimator that
 * can update the position of the polygons over time.
 */
public class PolygonModel implements ModelUpdateListener, Iterable<Polygon> {
    private final PolygonSet polygonSet;
    private final PolygonSetAnimator animator;

    public PolygonModel() {
        polygonSet = new PolygonSet();
        animator = new PolygonSetAnimator(polygonSet);
        animator.addListener(this);
    }//constructor

    // Delegate these methods to the polygon set
    public void addPolygon(Polygon p){
        polygonSet.addPolygon(p);
        actOnPolygonAdded(p);
    }

    // Delegate these methods to the animator
    // TODO: Step 2a: Parameterize the animation over a Macro
    public void animate(){
        animator.animate();
    }

    @Override
    public Iterator<Polygon> iterator() {
        return polygonSet.iterator();
    }

    // We use a chained observer pattern, where objects of this class act
    // as both observer (of the PolygonSetAnimator) and observable (for
    // external clients).

    private final List<ModelUpdateListener> listeners = new ArrayList<>();
    public void addListener(ModelUpdateListener l){
        listeners.add(l);
    }

    @Override
    public void actOnModelUpdate() {
        for (ModelUpdateListener l : listeners)
            l.actOnModelUpdate();
    }

    @Override
    public void actOnPolygonAdded(Polygon p) {
        for (ModelUpdateListener l : listeners)
            l.actOnPolygonAdded(p);
    }
}

