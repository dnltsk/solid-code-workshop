package org.dnltsk.solid.ocp.spatial.solid;

import java.util.List;

public class AreaCalculator {

    public double calcArea(List<Area> surfaceGeometries) {
        return surfaceGeometries.stream()
                .mapToDouble(Area::calcArea)
                .sum();
    }

}
