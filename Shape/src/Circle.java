
public class Circle extends Shape {
private double radius;
public Circle (String ShapeName, double rad)
{
	super(ShapeName);
	radius = rad;
}

public double getRadius() {
	return radius;
}

public void setRadius(double radius) {
	this.radius = radius;
}

@Override
public double getArea() 
{
	return Math.PI*radius*radius;
}
public double getVolume()
{
   return 4/3*Math.PI*radius*radius*radius;
}

@Override
public String toString() 
{
	return String.format("%s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
	       super.toString(),
	       "Its radius is", getRadius(),
           "AREA" , getArea(),
           "VOLUME", getVolume());
}
 }