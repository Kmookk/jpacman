package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * @author Arie van Deursen
 */
public class DirectionTest {
    /**
     * Do we get the correct delta when moving north?
     */
    @Test
    void testNorth() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }
    /**
     * Verifies that the {@link Direction#SOUTH} constant has the correct Y-axis delta.
     * <p>
     * This test ensures that calling {@code getDeltaY()} on {@code SOUTH}
     * returns {@code 1}, indicating downward movement along the Y-axis.
     */
    @Test
    void testSouth() {
        Direction south = Direction.valueOf("SOUTH");
        assertThat(south.getDeltaY()).isEqualTo(1);
    }
    /**
     * Verifies that the {@link Direction#EAST} constant has the correct X-axis delta.
     * <p>
     * This test ensures that calling {@code getDeltaX()} on {@code EAST}
     * returns {@code 1}, indicating rightward movement along the X-axis.
     */
    @Test
    void testEast() {
        Direction east = Direction.valueOf("EAST");
        assertThat(east.getDeltaX()).isEqualTo(1);
    }
    /**
     * Verifies that the {@link Direction#WEST} constant has the correct X-axis delta.
     * <p>
     * This test ensures that calling {@code getDeltaX()} on {@code WEST}
     * returns {@code -1}, indicating leftward movement along the X-axis.
     */
    @Test
    void testWest() {
        Direction west = Direction.valueOf("WEST");
        assertThat(west.getDeltaX()).isEqualTo(-1);
    }
}
