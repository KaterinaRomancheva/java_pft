package ru.sundbox;

public class jav {

   public static void main(String[] args) {
      hello("1111");
      hello("user");

      double l = 5;
      System.out.println("площадь квадрата со строной" + l + "равна" + area(l));
      double a= 4;
      double b = 6;
      System.out.println("площадь прмоугольнка со строной" + a + "и"+ b + "равна" + area(a,b));

   }

   public static void hello(String somebody){

      System.out.println("hello" + somebody);
   }
   public static double area(double a){
      return   a*a;
   }
   public static double area (double a, double b) {
      return a*b;
   }
}