package ru.sundbox;

import sun.java2d.ScreenUpdateManager;

public class Square {
   public double l;

   public Square(double len) {
      this.l = len;
   }

   public double area() {
      return this.l * this.l;
   }
}
