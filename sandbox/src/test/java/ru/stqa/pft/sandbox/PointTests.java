package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.stqa.pft.sandbox.Point.distance;

/**
 * Created by Home on 03.12.2016.
 */
public class PointTests {
  @Test

  public void TestDistance(){
    Point p1=new Point(25.3,10.5);
    Point p2=new Point(10.5,55.5);
    Assert.assertEquals(distance(p1,p2),47.0);
  }
}