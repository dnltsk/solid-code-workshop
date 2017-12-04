package org.dnltsk.solid.ocp.spatial.solid;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {

    @Test
    public void width_2_and_height_3_is_area_6() throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 2;
        rectangle.height = 3;
        assertThat(rectangle.calcArea()).isEqualTo(6);
    }

    @Test
    public void width_0_and_height_0_is_area_0() throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 0;
        rectangle.height = 0;
        assertThat(rectangle.calcArea()).isEqualTo(0);
    }

}