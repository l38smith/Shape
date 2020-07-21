
public abstract class Shape {
	
	protected String shapeName;
	public Shape( String shapeName)
	{
	   this.shapeName = shapeName;
	}
	
	public String getShapeName()
	{
		return shapeName;
	}


@Override
public String toString() 
{
	return String.format("The calculations for the " + getShapeName() + " are: ");
                                   
}
public abstract double getArea();
public abstract double getVolume();
}

