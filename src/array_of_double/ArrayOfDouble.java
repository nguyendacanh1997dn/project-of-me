package array_of_double;

public class ArrayOfDouble {
	private int capacity;
	private int n;
	private Double[] a;
	
	public ArrayOfDouble()
	{
		capacity=10;
		n=0;
		a=new  Double  [capacity];
	}
	public ArrayOfDouble(int capacity)
	{
		this.capacity=capacity;
		n=0;
		a=new Double [capacity];
	}
	public void add(Double element)
	{
		if(capacity==n)
		{
			Double b[]=new Double [capacity*2];
			capacity*=2;
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		a[n]=element;
		n++;
	}
	public void add(Double element, int index)
	{
		if(capacity==n)
		{
			Double b[]=new Double [capacity*2];
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
				a[n]=0.0;
			}
		}
	}
	public boolean contains(Double element)
	{
		if(n==0)
			return false;
		else
		{
			int i=0;
			while(i<n)
			{
				if (a[i]==element)
					return true;
			}
		}
		return false;
	}
	public int size()
	{ 
		return n;
	}
	public Double getindex(int index)
	{
		if(index>=n||index<0)
		{
			System.out.println("Invalid");
			return null;
		}
		return a[index];
	}
	public void set(Double element,int index)
	{
		if(index>=n||index<0)
			System.out.println("invalid");
		else
			a[index]=element;
	}
	public void remove(Double element)
	{
		for(int i=0;i<n;i++)
			if(a[i]==element)
			{
				remove(i);
				i--;
			}
	}
}
