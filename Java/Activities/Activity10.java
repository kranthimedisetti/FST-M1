package activities;

import java.util.HashSet;

public class Activity10 {
	
	public static void main(String args[]) {
	HashSet<String> hs = new HashSet<String>();
	hs.add("Entry1");
	hs.add("Entry2");
	hs.add("Entry3");
	hs.add("Entry4");
	hs.add("Entry5");
	hs.add("Entry6");
	System.out.println("Size of the HashSet: "+hs.size());
	System.out.println("Remove an element: "+hs.remove("Entry6"));
	System.out.println("Size of the HashSet after remove:"+hs.size());
	if(hs.remove("Entry6")) {
	System.out.println("Removed from HashSet");
	}else {
		System.out.println("Element not removed as its not present");
	}
	if(hs.contains("Entry3")) {
	System.out.println("Entry3 - Available");
	}else {
		System.out.println("Entry3 - Not Available");
	}
			System.out.println("Hash Set Elements:"+hs);
	}	
}
