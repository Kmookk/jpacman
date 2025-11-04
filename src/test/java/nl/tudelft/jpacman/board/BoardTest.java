package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
/**
 * Tests that a valid board configuration satisfies the invariant condition.
 */
public class BoardTest {
    /**
     * Verifies that a valid board configuration satisfies the invariant condition.
     * <p>
     * This test creates a 1x1 grid containing a single {@link BasicSquare},
     * initializes a {@link Board} with it, and asserts that the board's
     * {@code invariant()} method returns {@code true}, indicating a valid state.
     */
    @Test
    void validBoard() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        Board board = new Board(grid);
        assertThat(board.invariant()).isTrue();
    }
    /**
     * Verifies that creating a {@link Board} with a {@code null} square
     * violates the board invariant and triggers an {@link AssertionError}.
     * <p>
     * This test constructs a 1x1 grid containing a {@code null} element,
     * and asserts that instantiating a {@link Board} with this grid
     * throws an {@code AssertionError}, indicating that null squares
     * are not allowed in a valid board configuration.
     */
    @Test
        void validBoard_Null() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;
        assertThrows(AssertionError.class, () -> new Board(grid));
    }
}
