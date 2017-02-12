package my_array_list;

import array_of_rectangle.Rectangle;

public class MyArrayList <E> {

	private int capacity;
	private int n;
	private E[] a;

	public MyArrayList()
	{
		capacity=10;
		n=0;
		a= (E[]) new  Object  [capacity];
	}
	public MyArrayList(int capacity)
	{
		this.capacity=capacity;
		n=0;
		a= (E[]) new  Object  [capacity];
	}
	public void add(E element)
	{
		if(capacity==n)
		{
			E b[]=  (E[]) new Object [capacity*2];
			capacity*=2;
			for(int i=0;i<n;i++)
				b[i]=a[i];
			a=b;
		}
		a[n]=element;
		n++;
	}
	public void add(E element, int index)
	{
		if(capacity==n)
		{
			E b[]=  (E[]) new Object [capacity*2];
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
	public String  toString ()
	{
		String s="  ";
		for(int i=0;i<n;i++)
			s=s +a[i] +" ";
		return s;
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
	public boolean contains(E element)
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
				if (a[i].equals(element)==true)
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
	public E getindex(int index)
	{
		if(index>=n||index<0)
		{
			System.out.println("Invalid");
			return null;
		}
		return a[index];
	}
	public void set(E element,int index)
	{
		if(index>=n||index<0)
			System.out.println("invalid");
		else
			a[index]=element;
	}
	public void remove(E element)
	{
		for(int i=0;i<n;i++)
			if(a[i]==element)
			{
				remove(i);
				i--;
			}
	}
	
	
}
