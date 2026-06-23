
/**
 * User Interface.
 *
 * @author Isaiah Taumoepeau
 */
class GameUI {
    private final GameUserDisplay DISPLAY;
    private final GameUserInput INPUT;
    
    private GameUserAction previousUserAction;
    
    /**
     * Constructor for objects of class UI
     */
    GameUI(GameUserDisplay display, GameUserInput input) {
        this.DISPLAY = display;
        this.INPUT = input;
    }
    
    static GameUI terminalGameUI() {
        var display = new TerminalGameUserDisplay();
        var input = new TerminalGameUserInput();
        var terminalInstance = new GameUI(display, input);
        return terminalInstance;
    }
    
    void updateDisplay(Cell[][] grid) {
        DISPLAY.updateGrid(grid);
    }
    
    void askUserForAction() {
        DISPLAY.promptUserForAction(new String());
        INPUT.getUserAction();
    }
    
    GameUserAction userAction() {
        try {
            return previousUserAction;
        } catch(NullPointerException exception) {
            askUserForAction();
            return previousUserAction;
        }
    }
}
