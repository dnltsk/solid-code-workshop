package org.dnltsk.solid.ocp.spatial.solid;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class CircleTest {

    @Test
    public void radius_2_is_area_12() throws Exception {
        Circle circle = new Circle();
        circle.radius = 2;
        assertThat(circle.calcArea()).isCloseTo(12.567, within(0.001));
    }

    @Test
    public void radius_0_is_area_0() throws Exception {
        Circle circle = new Circle();
        circle.radius = 0;
        assertThat(circle.calcArea()).isEqualTo(0);
    }

}