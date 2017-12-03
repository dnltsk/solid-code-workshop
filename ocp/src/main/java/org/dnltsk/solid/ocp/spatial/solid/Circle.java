package org.dnltsk.solid.ocp.spatial.solid;

public class Circle implements Area{

    public double radius;

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}
