package edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

/**
 * Created by Niklas on 2016-03-02.
 */
//@FunctionalInterface
public interface Transform {
    // TODO: Step 1a: What is the representation of a transform?
    public Polygon transform(Polygon polygon);
}
