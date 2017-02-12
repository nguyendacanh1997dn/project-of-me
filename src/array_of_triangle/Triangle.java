package array_of_triangle;

import array_of_rectangle.Rectangle;

public class Triangle {
	int a,b,c;
	public Triangle() {
		a=b=c=0;
	}
	public Triangle(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void seta(int a)
	{
		if(a<0)
			a=0;
		else
			this.a=a;
	}
	public int geta()
	{
		return a;
	}
	public void setb(int b)
	{
		if(b<0)
			b=0;
		else
			this.b=b;
	}
	public int getb()
	{
		return b;
	}
	public void setc(int c)
	{
		if(c<0)
			c=0;
		else
			this.c=c;
	}
	public int getc()
	{
		return c;
	}
	public String toString()
	{
		return  a+";"+b+";"+c;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this.a==((Triangle) obj).a && this.b == ((Triangle)obj).b&&this.c == ((Triangle)obj).c)
			return true;
		else
			return false;
	}
}
