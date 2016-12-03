package ru.stqa.pft.sandbox;

/**
 * Created by Home on 27.11.2016.
 */
public class Point {
  Double x;
  Double y;

  public Point(Double x, Double y) {
    this.x = x;
    this.y = y;
  }

  public static void main(String [] args){
    Point p1=new Point(20.5,10.5);
    System.out.println("Координаты первой точки:"+p1.x+" и "+p1.y);
    Point p2=new Point(10.5,5.5);
    System.out.println("Координаты второй точки:"+p2.x+" и "+p2.y);
    System.out.println("Расстояние между точками="+distance(p1,p2));
  }

 public static double distance(Point p1, Point p2){
    double d;
    d=Math.sqrt(Math.pow(p1.x-p2.x,2)+Math.pow(p1.y-p2.y,2));
    return Math.round(d);
  }
}
