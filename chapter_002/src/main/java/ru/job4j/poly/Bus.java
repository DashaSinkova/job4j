package ru.job4j.poly;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bus implements Transport {
    private int qtPlaces;
    private double fuelPrice;
    private double qtFuelper100km;
    private double tankQt;
    private double qtFuel;

    public Bus(int qtPlaces, double fuelPrice, double qtFuelper100km, double tankQt, double qtfuel) {
        this.qtPlaces = qtPlaces;
        this.fuelPrice = fuelPrice;
        this.qtFuelper100km = qtFuelper100km;
        this.tankQt = tankQt;
        this.qtFuel = qtfuel;
    }
    @Override
    public void drive() {
        System.out.println("Автобус проехал " + (String.format("%.2f", qtFuel * 100 / qtFuelper100km) + " км."));
        System.out.println("На сколько километров автобусу хватит топлива " + (String.format("%.2f", tankQt / (qtFuelper100km / 100))) + " км.");
    }
    public static boolean reg(String str) {
        Pattern p = Pattern.compile("^[0-9]*[.]?[0-9]+$");
        Matcher m = p.matcher(str);
        return m.matches();
    }

    public static double parseToDouble(String str) {
        boolean flag;
        double res = -1;
            if (reg(str)) {
                flag = true;
            } else {
                flag = false;
            }
        if (flag) {
            res = Double.parseDouble(str);
        } else {
            System.out.println("Введите, пожалуйста, корректное значение!" + System.lineSeparator() + "Обратите внимание на пунктуацию \"1 - 9 ,\".");
        }
        return res;
    }
    @Override
    public void passengers(int qt) {
        System.out.println("В автобусе свободно: " + (qtPlaces - qt) + " мест");
    }
    @Override
    public double fillUp(double qtFuel) {
        return fuelPrice * qtFuel;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("=== Характеристики транспорта ===");
        int qtPlaces, pas;
        double qtFuelper100km, tankQt, fuelPrice, qtFuel;
        boolean flag;
        do {
            System.out.print("Введите кол-во мест в автобусе: ");
            qtPlaces = (int) parseToDouble(s.nextLine());
            System.out.println(qtPlaces);
        } while (qtPlaces == -1);
        do {
            System.out.print("Введите расход топлива на 100 км: ");
            qtFuelper100km = parseToDouble(s.nextLine());
        } while (qtFuelper100km == -1);
        do {
            System.out.print("Введите объем топливного бака: ");
            tankQt = parseToDouble(s.nextLine());
        } while (tankQt == -1);
                System.out.println("=== Данные о поездке ===");
        do {
            System.out.print("Введите стоимость топлива: ");
            fuelPrice = parseToDouble(s.nextLine());
        } while (fuelPrice == -1);
        do {
            System.out.print("Введите кол-во пассажиров: ");
            pas = (int) parseToDouble(s.nextLine());
            if (pas <= qtPlaces) {
                flag = false;
            } else {
                System.out.println("Ошибка! Кол - во пассажиров должно быть меньше или равно кол-ву посадочных мест");
                flag = true;
            }
        } while (flag || pas == -1);
        do {
            System.out.print("Введите кол-во затраченного на поездку топлива: ");
            qtFuel = parseToDouble(s.nextLine());
        } while (qtFuel == -1);
                Bus bus = new Bus(qtPlaces, fuelPrice, qtFuelper100km, tankQt, qtFuel);
                System.out.println("=== Итоги ===");
                System.out.println("Cтоимость топлива составляет " + bus.fillUp(qtFuel) + " руб.");
                bus.passengers(pas);
                bus.drive();
    }
}
