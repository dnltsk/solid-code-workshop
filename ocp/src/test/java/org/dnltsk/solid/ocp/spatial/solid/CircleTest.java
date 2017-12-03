package org.dnltsk.solid.ocp.spatial.solid;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class CircleTest {

    @Test
    public void circle_radius_2_is_area_() throws Exception {
        Circle circle = new Circle();
        circle.radius = 2;
        assertThat(circle.calcArea()).isCloseTo(12.567, within(0.001));
    }

}