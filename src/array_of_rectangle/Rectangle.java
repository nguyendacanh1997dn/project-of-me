package array_of_rectangle;

public class Rectangle {
	int lenght,width;
	public Rectangle() {
		lenght=width=0;
	}
	public Rectangle(int a,int b)
	{
		seta(a);
		setb(b);
	}
	public void seta(int a)
	{
		if(a<0)
			a=0;
		else
			this.lenght=a;
	}
	public int geta()
	{
		return lenght;
	}
	public void setb(int b)
	{
		if(b<0)
			b=0;
		else
			this.width=b;
	}
	public int getb()
	{
		return width;
	}
	public String toString()
	{
		return lenght +" "+width;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this.lenght==((Rectangle) obj).lenght && this.width == ((Rectangle)obj).width)
			return true;
		else
			return false;
	}
}
