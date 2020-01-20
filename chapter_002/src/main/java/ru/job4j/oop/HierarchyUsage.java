package ru.job4j.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        Car car = new Car();
        Transport transport = car;
        Object object = car;
        Object ob = new Car();
        Car carFromObject = (Car) ob;
        Object bicycle = new Bicycle();
        Transport car1 = (Transport) bicycle;
    }
}
