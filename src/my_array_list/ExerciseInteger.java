package my_array_list;
import java.util.Scanner;
import java.util.ArrayList;

public class ExerciseInteger {
	private ArrayList<Integer> arr = new ArrayList<Integer>();
	//question a
	public void input()
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
	public String toString()
	{
		return arr.toString();
	}
	//question b
	public int sum()
	{
		int s=0;
		for(int i=0;i<arr.size();i++)
			s=s+arr.get(i);
		return s;
	}
	//question c
	public int count()
	{
		int s=0;
		for(int i=0;i<arr.size();i++)
			if(arr.get(i)%2==0)
				s +=1;
		return s;
	}
	//question d
	public void print()
	{
		for(int i=0;i<arr.size();i++)
			if(arr.get(i)%2==0 || arr.get(i)%5==0)
				arr.toString();
	}
	//question e
	public double average()
	{
		return (double)sum()/arr.size();
	}
	public void removeNegative()
	{
		for(int i=0;i<arr.size();i++)
			if(arr.get(i)<0)
			{
				arr.remove(i);
				i--;
			}
	}
	public void removeMedium()
	{
		for(int i=0;i<arr.size();i++)
			for(int j=i+1;j<arr.size();j++)
				if(arr.get(i).equals(arr.get(j)))
				{
					arr.remove(arr.get(j));
					j--;
				}
	}
	public void asending()
	{
		for(int i=0;i<arr.size();i++)
			for(int j=i+1;j<arr.size();j++)
				if(arr.get(i)>arr.get(j))
				{
					Integer tam= arr.get(j);
					arr.set(j,arr.get(i));
					arr.set(i, tam);
				}
	}
	public void decrease()
	{

		for(int i=0;i<arr.size();i++)
			for(int j=i+1;j<arr.size();j++)
				if(arr.get(i)<arr.get(j))
				{
					Integer tam= arr.get(j);
					arr.set(j,arr.get(i));
					arr.set(i, tam);
				}
	}
	public void insertIncreases(Integer k)
	{
		if(arr.get(0)>k)
			arr.add(0, k);
		else
			if(arr.get(arr.size()-1)<k)
				arr.add(k);
			else
				for(int i=0;i<arr.size();i++)
					if(arr.get(i)<k && arr.get(i+1)>=k	)
						arr.add(i+1, k);
	}
	public void odd()
	{
		for(int i=0;i<arr.size();i++)
			for(int j=i+1;j<arr.size();j++)
				if(arr.get(j)% 2==0)
				{
					Integer tam= arr.get(j);
					arr.set(j,arr.get(i));
					arr.set(i, tam);
				}
	}
	public boolean checkIncrease()
	{
		for(int i=0;i<arr.size()-1;i++)
			if(arr.get(i)<arr.get(i-1))
				return false;
		return true;
	}
	public void miniArray()
	{
		int start=0;int count=0;int max=0;
		{
			for(int i=0;i<arr.size()-1;i++)		
				if(arr.get(i)<arr.get(i+1))
				{
					count++;
					if(count>max)
					{
						max=count;
						start=i-max+1;
					}
				}
				else
					count=0;
		}
		for(int i=start;i<(start+max+1);i++)
			System.out.print(arr.get(i));
	}
	public int sumEnd()
	{
		return arr.get(arr.size()-1)+arr.get(arr.size()-2);
	}
	public int sumStart()
	{
		decrease();
		return arr.get(arr.size()-1)+arr.get(arr.size()-2);
	}
	public int sumMax()
	{
		asending();
		return arr.get(arr.size()-1)+arr.get(arr.size()-2);
	}
	public void reverse()
	{
		for(int i=0;i<arr.size()/2;i++)
		{
			Integer tam= arr.get(arr.size()-i-1);
			arr.set(arr.size()-i-1,arr.get(i));
			arr.set(i, tam);
		}
	}
	public static void main(String[] args) {
		ExerciseInteger anh =new ExerciseInteger();
		anh.input();
		/*System.out.println(anh);
		System.out.println(anh.sum());
		System.out.println("co bao nhieu so chan : "+anh.count());
		System.out.println(anh.average());
		anh.removeNegative();
		System.out.println(anh);*/
		//anh.removeMedium();
		/*anh.asending();
		anh.insertIncreases(6);*/
		//	anh.odd();
		//anh.miniArray();
		/*System.out.println(anh.sumMax());
		System.out.println(anh.sumEnd());
		System.out.println(anh.sumStart());*/
		anh.reverse();
		System.out.println(anh);
	}


}
