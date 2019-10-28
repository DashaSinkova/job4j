package ru.job4j.area;

public class MatrixCheck {
    public boolean isWin(char[][] board) {
        boolean res = false;
        boolean isRowWin, isColWin;

        for (int i = 0; i < board.length & !res; i++) {
            for (int j = 0; j < board.length & !res; j++) {
                if (board[i][j] == 'X') {
                    for (int k = 1; k < board.length; k++) {
                        isRowWin = board[i][k] == 'X' & board[i][k - 1] == 'X';
                        isColWin = board[k][j] == 'X' & board[k - 1][j] == 'X';
                        res = isColWin || isRowWin;
                        if (!res) {
                            break;
                        }

                    }
                }
            }

        }
        return res;
    }
}





