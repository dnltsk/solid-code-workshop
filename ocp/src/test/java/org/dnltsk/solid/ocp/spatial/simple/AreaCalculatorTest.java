package org.dnltsk.solid.ocp.spatial.simple;

import org.dnltsk.solid.ocp.spatial.simple.AreaCalculator;
import org.dnltsk.solid.ocp.spatial.simple.Rectangle;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AreaCalculatorTest {

    private AreaCalculator areaCalculator = new AreaCalculator();

    @Test
    public void width_two_by_height_three_is_area_six() throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 2;
        rectangle.height = 3;

        double area = areaCalculator.calcArea(rectangle);

        assertThat(area).isEqualTo(6);
    }

    @Test
    public void list_of_rectangles_is_working_fine() throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 2;
        rectangle.height = 3;
        List<Rectangle> rectangles = Arrays.asList(rectangle, rectangle, rectangle);

        double area = areaCalculator.calcArea(rectangles);

        assertThat(area).isEqualTo(6 * 3);
    }

}