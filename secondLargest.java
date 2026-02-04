import java.util.*;

public class secondLargest{

	public static void main(String[] args) {
	
		int arr [] = {2,3,5,7,9};

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

		System.out.println("Second largest : "+secMax);
	}
}
