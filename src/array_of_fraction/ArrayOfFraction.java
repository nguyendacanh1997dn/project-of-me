package array_of_fraction;

public class ArrayOfFraction {
	private int capacity;
	private int n;
	private Fraction[] a;
	
	public ArrayOfFraction()
	{
		capacity=10;
		n=0;
		a=new  Fraction  [capacity];
	}
	public ArrayOfFraction(int capacity)
	{
		this.capacity=capacity;
		n=0;
		a=new Fraction [capacity];
	}
	public void add(Fraction element)
	{
		if(capacity==n)
		{
			Fraction b[]=new Fraction [capacity*2];
			capacity*=2;
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		a[n]=element;
		n++;
	}
	public String  toString ()
	{
		String s="  ";
		for(int i=0;i<n;i++)
			s=s +a[i] +" "; // a[i].toString
		return s;
	}
	public void add(Fraction element, int index)
	{
		if(capacity==n)
		{
			Fraction b[]=new Fraction [capacity*2];
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
	public boolean contains(Fraction element)
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
	public Fraction getindex(int index)
	{
		if(index>=n||index<0)
		{
			System.out.println("Invalid");
			return null;
		}
		return a[index];
	}
	public void set(Fraction element,int index)
	{
		if(index>=n||index<0)
			System.out.println("invalid");
		else
			a[index]=element;
	}
	public void remove(Fraction element)
	{
		for(int i=0;i<n;i++)
			if(a[i]==element)
			{
				remove(i);
				i--;
			}
	}
}
