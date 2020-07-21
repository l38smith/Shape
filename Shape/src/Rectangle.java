
public class Rectangle extends Shape{
private double length;
private double height;
private double width;

public Rectangle (String ShapeName, double l, double h, double w) 
{
	super(ShapeName);
	length = l;
	height = h;
	width = w;
}

public double getLength() {
	return length;
}

public void setLength(double length) {
	this.length = length;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

public double getWidth() {
	return width;
}

public void setWidth(double width) {
	this.width = width;
}

@Override
public double getArea()
{
	return length*width;
}
public double getVolume()
{
	return length*width*height;
}
public String toString() 
{
	return String.format("%s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f",
		    super.toString(),
			"Its length is", getLength(),
            "Its height is", getHeight(),
            "Its width is" , getWidth(),
            "AREA", getArea(),
            "VOLUME", getVolume());
}
 }




