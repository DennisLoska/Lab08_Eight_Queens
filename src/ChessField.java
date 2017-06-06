/**
 * Created by Dennis on 06.06.2017.
 */
public class ChessField {

    private int display;
    private int column;
    private int row;
    private boolean hasQueen;

    public ChessField(int display, int column, int row){
        this.display=display;
        this.column = column;
        this.row = row;
    }

    public int getDisplay() {
        return display;
    }

    public boolean hasQueen() {
        return hasQueen;
    }

    public void setHasQueen(boolean hasQueen) {
        this.hasQueen = hasQueen;
    }
}
