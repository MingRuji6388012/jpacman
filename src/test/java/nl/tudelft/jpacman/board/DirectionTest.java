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
    /***
     * Test that the direction after pressing to the North.
     * The value in Y-Axis is subtracted by 1.
     */
    @Test
    void testNorth_deltaY() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }

    /***
     * Test that the direction after pressing to the North.
     * The value in X-Axis is remained the same.
     */
    @Test
    void testNorth_deltaX() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaX()).isEqualTo(0);
    }

    /***
     * Test that the direction after pressing to the South.
     * The value in Y-Axis is added by 1.
     */
    @Test
    void testSouth_deltaY() {
        Direction south = Direction.valueOf("SOUTH");
        assertThat(south.getDeltaY()).isEqualTo(1);
    }

    /***
     * Test that the direction after pressing to the South.
     * The value in X-Axis is remained the same.
     */
    @Test
    void testSouth_deltaX() {
        Direction south = Direction.valueOf("SOUTH");
        assertThat(south.getDeltaX()).isEqualTo(0);
    }

    /***
     * Test that the direction after pressing to the West.
     * The value in Y-Axis is remained the same.
     */
    @Test
    void testWest_deltaY() {
        Direction west = Direction.valueOf("WEST");
        assertThat(west.getDeltaY()).isEqualTo(0);
    }

    /***
     * Test that the direction after pressing to the West.
     * The value in X-Axis is subtracted by 1.
     */
    @Test
    void testWest_deltaX() {
        Direction west = Direction.valueOf("WEST");
        assertThat(west.getDeltaX()).isEqualTo(-1);
    }

    /***
     * Test that the direction after pressing to the East.
     * The value in Y-Axis is remained the same.
     */
    @Test
    void testEast_deltaY() {
        Direction east = Direction.valueOf("EAST");
        assertThat(east.getDeltaY()).isEqualTo(0);
    }

    /***
     * Test that the direction after pressing to the West.
     * The value in X-Axis is added by 1.
     */
    @Test
    void testEast_deltaX() {
        Direction east = Direction.valueOf("EAST");
        assertThat(east.getDeltaX()).isEqualTo(1);
    }
}
