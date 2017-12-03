package org.dnltsk.solid.ocp.spatial.solid;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class AreaCalculatorTest {

    @Test
    public void mixed_up_areas_are_summed_up_correctly() throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 2;
        rectangle.height = 3;
        Circle circle = new Circle();
        circle.radius = 2;
        List<Area> rectangles = Arrays.asList(rectangle, circle);

        double area = new AreaCalculator().calcArea(rectangles);
        assertThat(area).isCloseTo(18.567, within(0.001));
    }

}