package array_of_integer;

public class Test {

	public static void main(String[] args) {
			ArrayOfInteger anh =new ArrayOfInteger();
			/*anh.add(5);
			anh.add(5);
			anh.add(5);
			anh.add(5);
			anh.add(5);
			anh.add(5);*/
			
			anh.add(5);
			anh.add(5);
			anh.add(5);
			anh.add(5);
			anh.add(5);
			anh.add(6);
			anh.add(7, 5);
			anh.output();
			anh.remove(5);
			if(anh.contains(5)	) System.out.println("sss");
			//System.out.println(anh.size());
	//		System.out.println(anh.getindex(12));
		/*	anh.set(9, 3);
			anh.output();
			Integer a=new Integer(7);
			anh.remove(a);*/
			
	}

}
