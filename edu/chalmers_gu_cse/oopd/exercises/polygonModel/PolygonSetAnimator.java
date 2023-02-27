package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import java.util.ArrayList;
import java.util.List;

/* package-private */ class PolygonSetAnimator {
    private final PolygonSet polygonSet;
    private boolean moveForwards = true;
    private int ticker = 0;

    public PolygonSetAnimator(PolygonSet polygonSet) {
        this.polygonSet = polygonSet;
    }

    // TODO: Step 2: Parameterize over a Macro
    public void update(){
        ticker++;
        int value = moveForwards ? 10 : -10;
        polygonSet.translate(value, value);
        notifyListeners();
        if (ticker > 10) {
            moveForwards = !moveForwards;
            ticker = 0;
        }
    }

    // TODO: Step 2: Parameterize over a Macro
    public void animate(){
        try {
            while (true) {
                Thread.sleep(500);
                update();
            }
        } catch (InterruptedException e) {}
    }

    private final List<ModelUpdateListener> listeners = new ArrayList<>();
    public void addListener(ModelUpdateListener l){
        listeners.add(l);
    }
    protected void notifyListeners(){
        for (ModelUpdateListener l : listeners)
            l.actOnModelUpdate();
    }


}
