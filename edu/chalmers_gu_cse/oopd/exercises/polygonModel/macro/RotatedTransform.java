package edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

/**
 * Created by Niklas on 2016-03-02.
 */
public class RotatedTransform implements Transform {
    // TODO: Step 1b: Implement an example of a Transform class
    @Override
    public Polygon transform(Polygon polygon) {
        return polygon.rotate(0.5);
    }
}
