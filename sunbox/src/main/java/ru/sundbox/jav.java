package ru.sundbox;

public class jav {

   public static void main(String[] args) {
      hello("1111");
      hello("user");


      Square s = new Square(5);
      System.out.println("площадь квадрата со строной " + s.l + " равна " + s.area());
      Rectangle r = new Rectangle(4,6);
      System.out.println("площадь прмоугольнка со строной " + r.a + " и "+ r.b + " равна " + r.area());

   }

   public static void hello(String somebody){

      System.out.println("hello" + somebody);
   }


}