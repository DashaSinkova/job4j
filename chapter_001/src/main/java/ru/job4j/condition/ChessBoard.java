package ru.job4j.condition;

import java.util.Objects;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        try {
            Objects.checkIndex(x1, 8);
            Objects.checkIndex(x2, 8);
            Objects.checkIndex(y2, 8);
            Objects.checkIndex(y1, 8);
        } catch (Exception e) {
            return 0;
        }
        return Math.abs(x2 - x1) == Math.abs(y2 - y1) ? Math.abs(y2 - y1) : 0;
    }
}
