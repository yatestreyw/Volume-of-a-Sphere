package com.midlandstech.student.treywyates.volumeofasphere;

import android.util.Log;

import java.text.DecimalFormat;

//Defines a sphere
public class Sphere {
    private double r;

    public Sphere (double r) {
        this.r = r;
    }

    // Calculates volume using the radius given
    private double calcVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    @Override
    public String toString() {
        // Decimal format for cleaner output
        DecimalFormat df = new DecimalFormat("###.###");

        return ("A sphere with a radius of " + r +
                " has a volume of " + df.format(calcVolume()));
    }
}
