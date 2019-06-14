//finds the number of rotaions, degrees, and radians required to mover a certain distance given acertain wheel diameter
//Useful for robotics calculations

import java.awt.geom.CubicCurve2D.Double;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the Diameter In Metres:");
    double diameter = input.nextDouble();
    System.out.println("Enter the Distance In Metres:");
    double distance = input.nextDouble();

  double rads = distance/(diameter/2);
  double degrees = rads*(180/Math.PI);
  double revolutions = rads/(2*Math.PI);
  System.out.println("Radians is "+ rads);
  System.out.println("Degrees is "+ degrees);
  System.out.println("Turns is "+ revolutions);
  }
static double torads(double diam, double dist) {
    return dist/(diam/2);
  }
static double todegrees(double diam, double dist) {
    return (dist/(diam/2)*(180/Math.PI));
  }
static double toturns(double diam, double dist) {
    return (dist/(diam/2))/(2*Math.PI);
  }
}