
public class Triangle extends Shape{
	private double length;
	private double base;
	private double height;
	
	public Triangle(String ShapeName, double ln, double bs, double ht)
	{
		super (ShapeName);
		length = ln;
		base = bs;
		height = ht;
	}
public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
@Override
public double getArea()
{
	return base*height/2;
}
public double getVolume()
{
	return length*base*height/3;
}
@Override
public String toString() 
{
	return String.format(" %s%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f%n%s: %.2f",
		   super.toString(),
		   "Its length is", getLength(),
           "Its base is" , getBase(),
           "Its height is", getHeight(),
           "AREA", getArea(),
           "VOLUME", getVolume());
 }
}