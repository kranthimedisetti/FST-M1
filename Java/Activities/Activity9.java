package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myList = new ArrayList<>();
		myList.add("V1");
		myList.add("V2");
		myList.add("V3");
		myList.add("V4");
		myList.add("V5");
		
		for(String name:myList) {
			System.out.println("Name::"+name);
		}
		
		System.out.println("Third Name from the list:"+myList.get(2));
		System.out.println("V1 contains in the Array List"+myList.contains("V1"));
		System.out.println("Size of the Array"+myList.size());
		System.out.println("Remove V4 from the List"+myList.remove(3));
		System.out.println("Size of the Array"+myList.size());	
		
		for(String name:myList) {
			System.out.println("Name::"+name);
		}
	}

}
