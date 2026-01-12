abstract class Shape {
	abstract double area();
	abstract double perimeter();
	abstract String getName(); 
}

interface Resizable {
	void resize(double factor);
}

final class Circle extends Shape {
	private final double radius;

	Circle(double radius)
	{
		this.radius = radius;
	}

	@Override
	String getName()
	{
		return "Circle";
	}

	@Override
	double area()
	{
		return (radius * radius) * 3.1416;
	}

	@Override
	double perimeter()
	{
		return (2 * 3.1416 * radius);
	}
}

class Rectangle extends Shape implements Resizable {
	private double length;
	private double width;

	Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}

	@Override
	String getName()
	{
		return "Rectangle";
	}

	@Override
	double area()
	{
		return (length * width);
	}

	@Override
	double perimeter()
	{
		return (2 * (length + width));
	}

	@Override
	public void resize(double factor)
	{
		length *= factor;
		width *= factor;
	}
	
}


public class Main{
	public static void main(String[] args) {
		Shape[] shapes = {
			new Circle(5),
			new Rectangle(4, 6)
		};

		for(Shape s : shapes)
		{
			System.out.println("Area of " + s.getName() + " is : " + s.area());
			System.out.println("Perimeter of " + s.getName() + " is : " + s.perimeter());
		}

		System.out.println("---------------------------");
		Rectangle r = new Rectangle(2, 3);
		System.out.println("Rectangle Original Area : " + r.area());
		r.resize(2);
		System.out.println("Resize Rectangle Area : " + r.area());
		System.out.println("----------------------------");
	}
}