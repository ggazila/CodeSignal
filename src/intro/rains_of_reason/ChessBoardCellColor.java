package intro.rains_of_reason;
/*
Given two cells on the standard chess board,
determine whether they have the same color or not.

Example

For cell1 = "A1" and cell2 = "C3", the output should be
chessBoardCellColor(cell1, cell2) = true.

For cell1 = "A1" and cell2 = "H3", the output should be
chessBoardCellColor(cell1, cell2) = false.
 */
public class ChessBoardCellColor {
    boolean chessBoardCellColor(String cell1, String cell2) {
        if (cell1.matches("^[ACEG][1357]") && cell2.matches("[ACEG][1357]") ||
                cell1.matches("[BDFH][2468]") && cell2.matches("[BDFH][2468]")) {
            return true;
        }
        return false;
    }
}
