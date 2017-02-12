package my_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseShape {
	private ArrayList<Shape> arr =new ArrayList<Shape>();
	public void input()
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=kb.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the shape you want  (1(rectangle) / 2(circle) / 3(triangle)");
			int type=kb.nextInt();

		}
	}
	public static void main(String[] args) {

	}

}
