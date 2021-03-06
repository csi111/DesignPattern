package com.example.robinhood.designpattern.domain.exercise.aerobic;

import android.util.Log;

/**
 * Created by robinhood on 2017. 7. 3..
 */

public class StepperExercise extends Aerobic {
    private long step;

    public StepperExercise(long time) {
        super(time);
    }

    public void setStep(long step) {
        this.step = step;
    }

    public long getStep() {
        return step;
    }

    @Override
    long burnCalrorie() {
        return (time / 1000 / 60) * 12;
    }

    @Override
    public void doExercise() {
        Log.d("Exercise", "Stepper " + time + "time diet =" + burnCalrorie()+ "cal");
    }
}
