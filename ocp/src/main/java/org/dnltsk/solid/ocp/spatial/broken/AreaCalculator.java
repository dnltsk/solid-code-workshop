package org.dnltsk.solid.ocp.spatial.broken;

import java.util.List;

public class AreaCalculator {

    public double calcArea(List<Object> surfaceGeometries) {
        return surfaceGeometries.stream()
                .mapToDouble(this::calcArea)
                .sum();
    }

    public double calcArea(Object surfaceGeometry) {
        if (surfaceGeometry instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) surfaceGeometry;
            return rectangle.width * rectangle.height;
        } else if (surfaceGeometry instanceof Circle) {
            Circle circle = (Circle) surfaceGeometry;
            return Math.PI * Math.pow(circle.radius, 2);
        }
        throw new IllegalArgumentException();
    }

}
