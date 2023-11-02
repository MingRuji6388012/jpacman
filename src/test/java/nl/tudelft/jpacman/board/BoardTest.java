package nl.tudelft.jpacman.board;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class BoardTest {
    private Board board;
    private int weight = 1;
    private int height = 1;

    @BeforeEach
    void createBoard(){
        Square[][] grid = new Square[weight][height];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);
    }
    @Test
    void testWidth() {
        assertThat(board.getWidth()).isEqualTo(weight);
    }
    @Test
    void testHeight() {
        assertThat(board.getHeight()).isEqualTo(height);
    }
    @Test
    void testWithinBorders() {
        assertThat(board.withinBorders(weight-1,height-1)).isTrue();
    }
    @Test
    void testBasicSquare() {
        assertThat(board).isNotNull();
    }
    @Test
    void testSquareAt() {
        Square square = board.squareAt(weight-1,height-1);
        assertThat(square).isInstanceOf(BasicSquare.class);
    }

}
