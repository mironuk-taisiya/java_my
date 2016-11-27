package ru.stqa.pft.sandbox;

/**
 * Created by Home on 27.11.2016.
 */
public class Point {
  Double x;
  Double y;
  public static void main(String args[]){
    Point p1=new Point();
    p1.x=20.5;
    p1.y=10.5;
    System.out.println("Координаты первой точки:"+p1.x+" и "+p1.y);
    Point p2=new Point();
    p2.x=10.5;
    p2.y=5.5;
    System.out.println("Координаты второй точки:"+p2.x+" и "+p2.y);
    System.out.println("Расстояние между токами="+distance(p1,p2));
  }

  public static double distance(Point p1, Point p2){
    return Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
  }
}
