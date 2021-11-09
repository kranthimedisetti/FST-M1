package activities;

public class Activity4 {
	public static void main(String args[]) {
		
		
	
		int[] arr = {1,6,3,7,8,4,2};
		ascendingSort(arr);
	}
	
	public static void ascendingSort(int arr[]) {
		System.out.println("Size of the Array" +arr.length);
		int temp,j=0;
		System.out.println("Before Sorting");	
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);	
		}
		for(int i=1; i<arr.length;i++) {
			for(j=i;j>0;j--) {
				if(arr[j]<arr[j-1]){
					temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
			}
		System.out.println("After Sorting");
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		}
		
	}

