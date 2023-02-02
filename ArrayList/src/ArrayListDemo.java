

import java.util.ArrayList;
public class ArrayListDemo 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> arr= new ArrayList<>();
		arr.add(10);
		arr.add(100);
		arr.add(30);
		arr.add(1,80);
		//arr.remove(2);
		//Integer i=10;
		//arr.remove(i);
		
		
		arr.set(0,20);
		
		
		
		//System.out.println(arr);
		//System.out.println(arr.get(0));
		//System.out.println(arr.get(3));
		/*
		for(int i=0;i<arr.size();i++)
		{
		// here i is working as an index
			System.out.println(arr.get(i));
		}
		*/
		
		//Enhanced for loop or for each loop
		for(int i : arr)
		{
			//here i is working as element of the arraylist
			System.out.println(i);
		}
		
		
	}

}
