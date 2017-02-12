package my_array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseInteger1 {
	private ArrayList<Integer> arr1 =new ArrayList<Integer>();
	private ArrayList<Integer> arr2 =new ArrayList<Integer>();
	private void input(ArrayList<Integer> arr)
	{
		Scanner kb=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=kb.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter element   "+i+": ");
			int e=  kb.nextInt();
			arr.add(e);
		}
	}
	public void input()
	{
		input(arr1);
		input(arr2);
	}
	public String toString()
	{
		String s= " ";
		s= arr1.toString() +"\n"+arr2.toString();
		return s;
	}
	public void  plus()
	{
		ArrayList<Integer> arr3 =new ArrayList<Integer>();
		int i=0;int j=0;
		while(i<arr1.size()&&j<arr2.size())
		{
			if(arr1.get(i)>=arr2.get(j))
				{
				arr3.add(arr2.get(j));
				j++;
				}
			else
			{
				arr3.add(arr2.get(i));
				i++;
			}
		}
		while(i<arr1.size())
		{
			arr3.add(arr1.get(i));i++;
		}
		while(j<arr2.size())
		{
			arr3.add(arr2.get(j));j++;
		}
		System.out.println(arr3);
	}
	public static void main(String[] args) {
		ExerciseInteger1 anh=new ExerciseInteger1();
		anh.input();
		System.out.println(anh);
		anh.plus();
		

	}

}
