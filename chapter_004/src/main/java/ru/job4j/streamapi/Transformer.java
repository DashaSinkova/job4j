package ru.job4j.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Transformer {
    public static List<Integer> convertMatrixToList(Integer[][] arr) {
        return Arrays.stream(arr).flatMap(Arrays :: stream).collect(Collectors.toList());
    }
}
