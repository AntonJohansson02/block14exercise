package edu.chalmers_gu_cse.oopd.exercises.polygonModel.macro;

import java.util.ArrayList;
import java.util.List;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.Polygon;

/**
 * Created by Niklas on 2016-03-02.
 */
public class Macro {
    private final List<Transform> transforms = new ArrayList<>();

    // TODO: Step 1c: Implement this method (should be trivial)
    public void addTransform(Transform transform){
        transforms.add(transform);
    }

    // TODO: Step 1d: Implement a method transform. What signature should it have?
    public Polygon transform(Polygon polygon){
        for (Transform transform: transforms){
            polygon = transform.transform(polygon);
        }
        return polygon;
    }   
}
