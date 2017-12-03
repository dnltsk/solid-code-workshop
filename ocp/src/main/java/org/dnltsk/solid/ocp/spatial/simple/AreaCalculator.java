package org.dnltsk.solid.ocp.spatial.simple;

import java.util.List;

public class AreaCalculator {

    public double calcArea(List<Rectangle> rectangles){
        return rectangles.stream()
                .mapToDouble(this::calcArea)
                .sum();
    }

    public double calcArea(Rectangle rectangle){
        return rectangle.width * rectangle.height;
    }

}
