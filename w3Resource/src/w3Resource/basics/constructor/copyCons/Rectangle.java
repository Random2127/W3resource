package w3Resource.basics.constructor.copyCons;

public class Rectangle {

	private double length;
	private double width;

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	// A copy constructor where we initialize an object from an existing one
	public Rectangle(Rectangle rectangle) {
		this.length = rectangle.length;
		this.width = rectangle.width;

	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

}
