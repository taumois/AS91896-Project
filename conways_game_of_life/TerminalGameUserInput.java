
/**
 * TerminalUserInput here.
 */
class TerminalGameUserInput implements GameUserInput {
    
    /**
     * Constructor for objects of class TerminalUserInput
     */
    TerminalGameUserInput(){
        //
    }
    
    /**
     * Gets the users most recent action/input(if available)
     */
    public GameUserAction getUserAction() {
        GameUserAction action = new GameUserAction();
        return action;
    }
}
