package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCounter {
   public List<Double> diapason(int start, int end, Function<Double, Double> func) {
       List<Double> res = new ArrayList<>();
       for (double value = start; value < end; value++) {
           res.add(func.apply(value));
       }
       return res;
   }
}
