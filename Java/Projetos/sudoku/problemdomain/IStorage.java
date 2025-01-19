package sudoku.problemdomain;

import java.io.IOException;

public interface IStorage {
    void updateGameData(SudokuGame game) throws IOException;                // exceção em caso de erro IO
    SudokuGame getGameData() throws IOException;                         
}
