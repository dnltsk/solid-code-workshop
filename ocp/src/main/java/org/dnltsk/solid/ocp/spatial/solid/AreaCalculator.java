package org.dnltsk.solid.ocp.spatial.solid;

import java.util.List;

public class AreaCalculator {

    public double calcArea(List<Area> areaGeometries) {
        return areaGeometries.stream()
            .mapToDouble(Area::calcArea)
            .sum();
    }

    /**
     * This is now somehow obsolete
     * @param areaGeometry
     * @return
     */
    public double calcArea(Area areaGeometry){
        return areaGeometry.calcArea();
    }

}
