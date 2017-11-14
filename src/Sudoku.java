public class Sudoku {

    // 4 kyu
    // Sudoku Solution Validator
    public boolean check(int[][] sudoku) {
        int counter = 0;
        for (int col = 0; col < sudoku.length; col++) {
            for (int row = 0; row < sudoku[col].length; row++) {
                for (int num = 1; num < 10; num++) {
                    if (sudoku[col][row] != num) {
                        counter += 1;
                        if (counter == 9) {
                            return false;
                        }
                    } else {
                        counter = 0;
                        break;
                    }
                }
            }
        }
        return true;
    }


}
