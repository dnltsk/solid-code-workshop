package org.dnltsk.solid.ocp.spatial.solid;

public class Rectangle implements Area{

    public double width;
    public double height;

    @Override
    public double calcArea() {
        return width * height;
    }
}
