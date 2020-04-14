//package ru.job4j.sort;
//import java.util.Arrays;
//
//public class Machine {
//    private final int[] COINS = {10, 5, 2, 1};
//
//    public int[] change(int money, int price) {
//        int[] rsl = new int[100];
//        int change = money - price;
//        int size = 0;
//        for (int i = 0, j = 0; i < COINS.length; i++) {
//            if (change - COINS[i] >= 0) {
//                while (change - COINS[i] >= 0) {
//                    change = change - COINS[i];
//                    rsl[j] = COINS[i];
//                }
//                size++;
//                j++;
//            }
////        int[] rsl = new int[100];
////        int change = money - price;
////        int size = 0;
////        for (int i = 0, j = 0; i < COINS.length; i++) {
////            boolean flag = false;
////            while (change > 1) {
////                int res = change - COINS[i];
////                if (res < 0) {
////                    break;
////                }
////                change = res;
////                flag = true;
////            }
////            if (flag) {
////                rsl[j++] = COINS[i];
////                size++;
////            }
//        }
//        return Arrays.copyOf(rsl, size);
//    }
//}
//
