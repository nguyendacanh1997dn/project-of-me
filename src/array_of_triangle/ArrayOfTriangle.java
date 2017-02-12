package array_of_triangle;

public class ArrayOfTriangle {
	private int capacity;
	private int n;
	private Triangle[] a;
	public String  toString ()
	{
		String s="  ";
		for(int i=0;i<n;i++)
			s=s +a[i] +" ";
		return s;
	}
	public ArrayOfTriangle()
	{
		capacity=10;
		n=0;
		a=new  Triangle  [capacity];
	}
	public ArrayOfTriangle(int capacity)
	{
		this.capacity=capacity;
		n=0;
		a=new Triangle [capacity];
	}
	public void add(Triangle element)
	{
		if(capacity==n)
		{
			Triangle b[]=new Triangle [capacity*2];
			capacity*=2;
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		a[n]=element;
		n++;
	}
	public void add(Triangle element, int index)
	{
		if(capacity==n)
		{
			Triangle b[]=new Triangle [capacity*2];
			capacity*=2;
			System.arraycopy(a, 0, b, 0, n);
			
			a=b;
		}
		if(index<0 || index>n)
			System.out.println("Invalid");
		else
		{
			if(index==n)
				add(element);
			else
			{
				for(int i=n;i>index;i--)
					a[i]=a[i-1];
				n++;
					a[index]=element;
			}
		}
	}
	public void output()
	{
		for(int i=0;i<n;i++)
			System.out.println(a[i]);
	}
	public void remove(int index)
	{
		if(n==0)
			System.out.println("Error");
		else
		{
			if(index>=n|| index<0)
				System.out.println("invalid");
			else
			{
				for(int i=index;i<n;i++)
					a[i]=a[i+1];
				n--;
				a[n]=null;
			}
		}
	}
	public boolean contains(Triangle element)
	{
		if(n==0)
		{
			return false;
		}
		else
		{
			int i=0;
			while(i<n)
			{
				System.out.println(i);
				if (a[i].equals(element))
						return true;
				i++;
			}
		}
		return false;
	}
	public int size()
	{
		return n;
	}
	public Triangle getindex(int index)
	{
		if(index>=n||index<0)
		{
			System.out.println("Invalid");
			return null;
		}
		return a[index];
	}
	public void set(Triangle element,int index)
	{
		if(index>=n||index<0)
			System.out.println("invalid");
		else
			a[index]=element;
	}
	public void remove(Triangle element)
	{
		for(int i=0;i<n;i++)
			if(a[i]==element)
			{
				remove(i);
				i--;
			}
	}
}
