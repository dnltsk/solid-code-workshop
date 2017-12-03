package org.dnltsk.solid.ocp.spatial.broken;

import org.assertj.core.data.Offset;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class AreaCalculatorTest {

    @Test
    public void rectangle_width_2_and_height_3_is_area_6() throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 2;
        rectangle.height = 3;
        double area = new AreaCalculator().calcArea(rectangle);
        assertThat(area).isEqualTo(6);
    }

    @Test
    public void circle_radius_2_is_area_() throws Exception {
        Circle circle = new Circle();
        circle.radius = 2;
        double area = new AreaCalculator().calcArea(circle);
        assertThat(area).isCloseTo(12.567, within(0.001));
    }

    @Test
    public void three_equal_objects_are_summed_up_correctly() throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 2;
        rectangle.height = 3;
        List<Rectangle> rectangles = Arrays.asList(rectangle, rectangle, rectangle);
        double area = new AreaCalculator().calcArea(rectangles);
        assertThat(area).isEqualTo(6 * 3);
    }

    @Test
    public void mixed_up_objects_are_summed_up_correctly() throws Exception {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 2;
        rectangle.height = 3;
        Circle circle = new Circle();
        circle.radius = 2;
        List<Object> rectangles = Arrays.asList(rectangle, circle);
        double area = new AreaCalculator().calcArea(rectangles);
        assertThat(area).isCloseTo(18.567, within(0.001));
    }

    @Test
    public void name() throws Exception {
        assertThatThrownBy(() -> {
            new AreaCalculator().calcArea("not an area");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}