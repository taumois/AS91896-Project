
/**
 * TextUserDisplay here.
 *
 * @author Isaiah Taumoepea
 */
class TextUserDisplay implements UserDisplay {
    private static final char ALIVE_CELL = 'W';
    private static final char DEAD_CELL = ' ';
    
    /**
     * Constructor for objects of class TextUserDisplay
     */
    TextUserDisplay(){
        //
    }
    
    /**
     * Displays a grid using text
     *
     * @param grid the grid to display
     */
    public void display(boolean[][] grid) {
        for(int column=0;column<grid.length;column++) {
            for(int row=0;row<grid[column].length;row++) {
                char cellRepresentation;
                
                System.out.print(grid[column][row]);
            }
            System.out.print("\n");
        }
    }
}
