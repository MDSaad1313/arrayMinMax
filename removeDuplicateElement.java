
import java.util.*;

public class removeDuplicateElement {
	
	public static void main(String[] args) {
		
		int arr[] = {1,1,2,2,3,3,4,5,6,6,7};
		
		int i = 0;
		int count = 0;
		for(int j=1; j<arr.length; j++) {
			
			if(arr[i] != arr[j]) {
				
				i++;
				
				arr[i] = arr[j];
				
				count++;
			}
		}
		
		for(int num : arr) {
			
			System.out.println(num+" ");
		}
		System.out.println("Uniqe Count : "+(i+1));
	}
}
