package ru.job4j.oop;

public class Jukebox {
    public static void main(String[] args) {
        Jukebox j = new Jukebox();
        j.music(1);
        j.music(13);
    }

    public void music(int position) {
          if (position == 1) {
              System.out.println("Пусть бегут неуклюже");
          } else if (position == 2) {
              System.out.println("Спокойной ночи");
          } else {
              System.out.println("Песня не найдена");
          }
    }
}
