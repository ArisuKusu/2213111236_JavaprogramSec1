
public class Cylinder extends Circle {
	private double height;
	private double radius;
	
	public Cylinder(double radius,double height) {
		super(radius,null);
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public double getVolume() {
		return super.getArea()*this.height;
	}
	public double getArea() {
		return 2 * Math.PI * (height + radius);
	}
	public String toString() {
		return "height= "+height+","+super.toString();
	}

}
