package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        return Math.abs(Math.abs(x2) - Math.abs(x1)) == Math.abs(Math.abs(y2) - Math.abs(y1)) ? Math.abs(y2 - y1) : 0;
    }
}
