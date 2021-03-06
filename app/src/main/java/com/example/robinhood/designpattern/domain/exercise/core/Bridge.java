package com.example.robinhood.designpattern.domain.exercise.core;

import android.util.Log;

import com.example.robinhood.designpattern.domain.exercise.TimeExercise;

/**
 * Created by sean on 2017. 7. 9..
 */

public class Bridge extends TimeExercise {


    public Bridge(long time) {
        super(time);
    }

    @Override
    public void doExercise() {
        Log.d("Exercise", "DO!! Bridge " + time + "ms");
    }
}
