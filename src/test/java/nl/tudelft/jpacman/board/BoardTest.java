package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BoardTest {

    @Test
    void ValidBoard () {
         Square[][] grid = new Square[1][1];
         grid[0][0] = new BasicSquare();

         Board board = new Board(grid);
         assertThat(board.invariant()).isTrue();

    }

    @Test
    void ValidBoard_Null () {
        Square[][] grid = new Square[1][1];
        grid[0][0] = null;

        assertThrows(AssertionError.class, () -> new Board(grid));

    }
}
