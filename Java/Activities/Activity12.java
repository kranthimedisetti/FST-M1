package activities;

interface Addable{
	int add(int num1, int num2);
}

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addable ad1 = (num1,num2) -> num1+num2;
		System.out.println("Addition: "+ad1.add(30,40));
		
	
	Addable ad2 = (num1,num2) -> {
	return(num1+num2);

	};

	System.out.println("Addition: "+ad2.add(90,40));
	
	}
}
