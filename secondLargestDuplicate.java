import java.util.*;

public class secondLargestDuplicate{

	public static void main(String[] args) {
	
		int arr[] = {5,5,5,5,5};

		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++) {
			
		     if(arr[i] > max) {	
			secMax = max;
			max = arr[i];

		}else if(arr[i] > secMax && arr[i] != max) {
		
			secMax = arr[i];
		}
	}
		System.out.println("secMax : "+secMax);
System.out.println("______________________________________________________________");

		int arr1[] = {-1,-2,-3,-4};

		int max1 = Integer.MIN_VALUE;
		int secMax1 = Integer.MIN_VALUE;

		for (int i1=0; i1<arr1.length; i1++) {
		
			if(arr1[i1] > max1) {
			
				secMax1 = max1;
				max1 = arr1[i1];

			}else if(arr1[i1] > secMax1 && arr1[i1] != max1) {
			
				secMax1 = arr1[i1];
			}
		}

	System.out.println("-Ve Max : "+secMax1);



	}
}
