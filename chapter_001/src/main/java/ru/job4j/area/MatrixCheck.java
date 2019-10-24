package ru.job4j.area;

public class MatrixCheck {
    public boolean isWin(char[][] board) {
        boolean res = false;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[i][j] == 'X') {
                    for (int k = 1; k < board.length; k++) {
                        if (board[i][k] == 'X' & board[i][k - 1] == 'X') {
                            res = true;
                        } else if (board[k][j] == 'X' & board[k - 1][j] == 'X') {
                            res = true;
                        } else {
                            res = false;
                            break;
                        }

                    }

                }

            }


        }
        return res;
    }
}

