
/**
 * GameGrid, a class to hold the state of the game, including every cell. Cells are booleans, where true = alive/false = dead
 *
 * @author Isaiah Taumoepeau
 */
class GameGrid
{
    private static final byte NEIGHBORS_PER_CELL = 8;
    
    private final int WIDTH;
    private final int HEIGHT;
    
    private boolean[][] cells;

    /**
     * Constructor for objects of class GameGrid
     * 
     * @param  width  width to make the game grid
     * @param  height height to make the game grid
     */
    GameGrid(int width, int height)
    {
        this.WIDTH = width;
        this.HEIGHT = height;
        cells = new boolean[HEIGHT][WIDTH];
    }
    
    /**
     * Returns the cell at the specified coordinate
     *
     * @param  x x-coordinate
     * @param  y y-coordinate
     * @return    the cell
     */
    boolean cell(int x, int y) {
        boolean cell = cells[y][x];
        return cell;
    }
    
    // /**
     // * Changes the value of the cell at the specified coordinate
     // *
     // * @param  value  to set the cell to
     // * @return    the cell
     // */
    // void setCell(int x, int y, boolean value) {
        // cells[y][x] = value;
    // }
    
    // /**
     // * Returns the neighbor cells of the cell at the specified index
     // *
     // * @param  index  self explanatory
     // * @return    the neighbors
     // */
    // boolean[] cellNeighbors(int x, int y) {
        // boolean[] neighbors = new boolean[NEIGHBORS_PER_CELL];
        // int i = 0;
        // for(int j=-1;j<=1;j++) {
            // for(int k=-1;k<=1;k++) {
                // if(j !=0 && k != 0) {
                    // neighbors[i] = cell(x+j, y+k);
                    // ++i;
                // }
            // }
        // }
        // // neighbors[0] = cell(x-1, y-1);
        // // neighbors[1] = cell(x, y-1);
        // // neighbors[2] = cell(x+1, y-1);
        // // neighbors[3] = cell(x-1, y);
        // // neighbors[4] = cell(x+1, y);
        // // neighbors[5] = cell(x-1, y+1);
        // // neighbors[6] = cell(x, y+1);
        // // neighbors[7] = cell(x+1, y+1);
        // return neighbors;
    // }
    
    /**
     * Returns the neighbor cells of the cell at the specified index
     *
     * @param  index  self explanatory
     * @return    the neighbors
     */
    boolean[] numberOfCellsLivingNeighbors(int x, int y) {
        int neighbors;
        
        for(int xOffset=-1;xOffset<=1;j++) {
            for(int k=-1;k<=1;k++) {
                if(j !=0 && k != 0) {
                    neighbors += i -> cell(x+j, y+k);
                }
            }
        }
        
        return neighbors;
    }
}
