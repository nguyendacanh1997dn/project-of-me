package my_array_list;

import array_of_integer.ArrayOfInteger;
import array_of_rectangle.ArrayOfRectangle;
import array_of_rectangle.Rectangle;
import array_of_triangle.ArrayOfTriangle;
import array_of_triangle.Triangle;

public class Main {

	public static void main(String[] args) {
		//ArrayOfInteger anh =new ArrayOfInteger();
		MyArrayList<Integer> anh = new MyArrayList<Integer>();
		anh.add(5);
		anh.add(6);
		anh.add(7);
		System.out.println(anh);
		if(anh.contains(15)	) System.out.println("yes");
		else System.out.println("no");

		//ArrayOfRectangle anh1 =new ArrayOfRectangle();
		MyArrayList<Rectangle> anh1 = new MyArrayList<Rectangle>();
		anh1.add(new Rectangle(5,6));
		anh1.add(new Rectangle(5,9));
		anh1.add(new Rectangle(5,7));
		System.out.println(anh1);
		Rectangle rec=new Rectangle(5,6);
		if(anh1.contains(rec)) System.out.println("yes");
		else System.out.println("no");
		
		//ArrayOfTriangle anh2 =new ArrayOfTriangle();
		MyArrayList<Triangle> anh2 = new MyArrayList<Triangle>();
		anh2.add(new Triangle(3,2,1));
		anh2.add(new Triangle(3,3,1));
		anh2.add(new Triangle(3,5,1));
		System.out.println(anh2);// goi ham anh2.toString 
		
	}

}
