package org.dnltsk.solid.ocp.spatial.solid;

import java.util.List;

public class AreaCalculator {

    public double calcArea(List<Area> areaGeometries) {
        return areaGeometries.stream()
            .mapToDouble(Area::calcArea)
            .sum();
    }

}
