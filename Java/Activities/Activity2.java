package activities;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {10,77,10,54,-11,10};
		int sum =0;
		for(int i=0; i<array.length;i++)
		{
		if(array[i]==10) {
		sum=sum+i;	
		}
		}
		if(sum==30) {
			System.out.println("Its equal to 30");
			
		}else {
			System.out.println("Its not equal to 30");
		}
	}

}
