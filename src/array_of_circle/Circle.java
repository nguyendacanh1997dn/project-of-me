package array_of_circle;

import array_of_rectangle.Rectangle;

public class Circle {
	private int radius;
	public Circle() {
		radius=0;
	}
	public Circle(int r)
	{
		this.radius=r;
	}
	public void setr(int r)
	{
		this.radius=r;
	}
	public int getr()
	{
		return radius;
	}
	public String toString()
	{
		return " "+radius ;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this.radius==((Circle) obj).radius)
			return true;
		else
			return false;
	}
}
