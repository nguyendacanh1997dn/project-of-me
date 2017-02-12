package array_of_fraction;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayOfFraction a =new ArrayOfFraction();
			a.add(new Fraction(9,6));
			a.add(new Fraction(5,4));
			a.add(new Fraction(9,6));
			a.add(new Fraction(5,4));
			a.add(new Fraction(9,6));
			a.add(new Fraction(5,4));
			a.add(new Fraction(7,8));
			a.output();
			if(a.contains(new Fraction (7,8))==true)
				System.out.println("cc");
			else
				System.out.println("CL");
	}

}
