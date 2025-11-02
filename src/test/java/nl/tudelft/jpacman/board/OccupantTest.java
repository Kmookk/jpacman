package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        Unit occupant = new BasicUnit();
        assertThat(occupant.hasSquare()).isFalse();
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        Square square = new BasicSquare();
        Unit occupant = new BasicUnit();

        occupant.occupy(square);

        assertThat(occupant.getSquare()).isEqualTo(square);
        assertThat(square.getOccupants()).contains(occupant);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        Square square1 = new BasicSquare();
        Square square2 = new BasicSquare();
        Unit occupant = new BasicUnit();

        occupant.occupy(square1);

        assertThat(occupant.getSquare()).isEqualTo(square1);
        assertThat(square1.getOccupants()).contains(occupant);

        occupant.occupy(square2);

        assertThat(occupant.getSquare()).isEqualTo(square2);
        assertThat(square2.getOccupants()).contains(occupant);
    }
}
