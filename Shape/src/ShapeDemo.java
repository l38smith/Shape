import java.util.Scanner;
public class ShapeDemo {

	public static void main(String[] args) {
		
		
   Scanner input = new Scanner(System.in);
   int choice = 0;
   String str;
   
   displayMenu();
   choice = input.nextInt();
	
   while (choice != 5)
   {
	   if (choice > 0 && choice < 5)
	   {
		   switch (choice)
		   {
		   
		   case 1: {
		   double radius;
		   String ShapeName = "circle";
		   input.nextLine();
		   System.out.println("Enter the radius of the circle.");
		   radius = input.nextDouble();
		   while (radius <= 0) {
			   System.out.println("Please enter a positive integer:");
			   	radius = input.nextDouble();}
		   Circle myCircle = new Circle (ShapeName, radius);
		   str = myCircle.toString();
		   System.out.println(str);
		   System.out.println();
		break;
		   }
		   case 2:{
		   double side;
		   String ShapeName = "square";
		   input.nextLine();
		   System.out.println("Enter the side dimensions of the square.");
		   side = input.nextDouble();
		   while (side <= 0) {
			   System.out.println("Please enter a positive integer:");
			   	side = input.nextDouble();}
		   Square mySquare = new Square (ShapeName, side);
		   str = mySquare.toString();
		   System.out.println(str);
		   System.out.println();
		break;
		   }
		   case 3:{
		   double length, height, width;
		   String ShapeName = "rectangle";
		   input.nextLine();
		   System.out.println("Enter the length of the rectangle.");
		   length = input.nextDouble();
		   while (length <= 0) {
			   System.out.println("Please enter a positive integer:");
			   	length = input.nextDouble();}
		   System.out.println("Enter the height of the rectangle.");
		   height = input.nextDouble();
		   while (height <= 0) {
			   System.out.println("Please enter a positive integer:");
			   	height = input.nextDouble();}
		   System.out.println("Enter the width of the rectangle.");
		   width = input.nextDouble();
		   while (width <= 0) {
			   System.out.println("Please enter a positive integer:");
			   	width = input.nextDouble();}
		   Rectangle myRectangle = new Rectangle (ShapeName, length, height, width);
		   str = myRectangle.toString();   
		   System.out.println(str);
		   System.out.println();
		break;
		   }
		   case 4:{
		   double base, length, height; 
		   String ShapeName = "Triangle";
		   input.nextLine();
		   System.out.println("Enter the length of the triangle.");
		   length = input.nextDouble();
		   while (length <= 0) {
			   System.out.println("Please enter a positive integer:");
			   	length = input.nextDouble();}
		   System.out.println("Enter the base of the triangle.");
		   base = input.nextDouble();
		   while (base <= 0) {
			   System.out.println("Please enter a positive integer:");
			   	base = input.nextDouble();}
		   System.out.println("Enter the height of the triangle.");
		   height = input.nextDouble();
		   while (height <= 0) {
			   System.out.println("Please enter a positive integer:");
			   	height = input.nextDouble();}
		   Triangle myTriangle = new Triangle (ShapeName, length, base, height);
		   str = myTriangle.toString();
		   System.out.println(str);
		   System.out.println();
	    break;
		   }
		  	}
	         }
	 	    else
		   System.out.println("Incorrect entry, try again.");
	       displayMenu();
	       choice=input.nextInt();
	   
   }
	}
	public static void displayMenu()
	{
		System.out.println("Enter 1 for a Circle");
		System.out.println("Enter 2 for a Square");
		System.out.println("Enter 3 for a Rectangle");
		System.out.println("Enter 4 for a Triangle");
		System.out.println("Enter 5 to Exit");
		
 }
}
