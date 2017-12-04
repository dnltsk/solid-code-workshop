package org.dnltsk.solid.ocp.spatial.violates;

import java.util.List;

public class AreaCalculator {

    public double calcArea(List<Object> areaGeometries) {
        return areaGeometries.stream()
                .mapToDouble(this::calcArea)
                .sum();
    }

    public double calcArea(Object areaGeometry) {
        if (areaGeometry instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) areaGeometry;
            return rectangle.width * rectangle.height;

        } else if (areaGeometry instanceof Circle) {
            Circle circle = (Circle) areaGeometry;
            return Math.PI * Math.pow(circle.radius, 2);
        }
        throw new IllegalArgumentException();
    }

}
