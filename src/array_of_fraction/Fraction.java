package array_of_fraction;
//trong moi lop luon luon co ham toString va equals de override lop cha (Object)
import java.util.Scanner;

import array_of_rectangle.Rectangle;


public class Fraction {
	private int numberator,denomirator;
	public Fraction()
	{
		numberator=0;
		denomirator=1;
	}
	public Fraction(int a , int b)
	{
		this.numberator=a;
		this.denomirator=b;
	}
	public void input()
	{
		Scanner insert=new Scanner(System.in);
		System.out.println("Enter the numberator : ");
		this.numberator=insert.nextInt();
		System.out.println("Enter the denomirator: ");
		this.denomirator=insert.nextInt();
	}
	public int  UCLN(int a,int b)
	{
		a=Math.abs(a);
		b=Math.abs(b);
		if(a==0 || b==0)
			return Math.abs(a-b);
		while(a!=b)
		{
			if(a>b)
				a=a-b;
			else
				b=b-a;
		}
		return a;
	}
	public String  toString()
	{
		return (numberator/UCLN(numberator, denomirator)    +"/"+ denomirator/UCLN(numberator, denomirator));
	}
	public Fraction plus(Fraction b)
	{	
		Fraction c=new Fraction();
		c.numberator=this.numberator*b.denomirator+b.numberator*this.denomirator;
		c.denomirator=this.denomirator*b.denomirator;
		return c;
	}
	
	public void setnumberator(int a)
	{
		this.numberator=a;
	}
	public int getnumberator()
	{
		return numberator;
	}
	public void setdenormirator(int a)
	{
		this.numberator=a;
	}
	public int getdenormirator()
	{
		return denomirator;
	}

	public double devide()
	{
		double devide= ((1.0*this.numberator)/this.denomirator);
		return devide;
	}
	@Override
	public boolean equals(Object obj)
	{
		if(this.denomirator/UCLN(this.denomirator, this.numberator)==((Fraction) obj).denomirator/UCLN(((Fraction) obj).denomirator, ((Fraction) obj).numberator) && this.numberator/UCLN(this.denomirator, this.numberator) == ((Fraction)obj).numberator/UCLN(((Fraction) obj).denomirator, ((Fraction) obj).numberator))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Fraction a =new Fraction(9,6);
			System.out.println(a.toString());
	}

}
