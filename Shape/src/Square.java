
public class Square extends Shape {
private double side;
public Square (String ShapeName, double s)
{
	super(ShapeName);
	side = s;
}

public double getSide() {
	return side;
}

public void setSide(double side) {
	this.side = side;
}

@Override
public double getArea()
{
	return side*side;
}
public double getVolume()
{
	return side*side*side;
}
@Override
public String toString() 
{
	return String.format("%s%n%s: %.2f%n%s: %.2f%n%s: %.2f",
		   super.toString(),
		   "Its side is", getSide(),
           "AREA" , getArea(),
           "VOLUME", getVolume());
 }
}



