import java.util.*;

public class intersectionSortedArrays{

	public static void main(String[] args) {
	
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {2,3,5,6};

		ArrayList<Integer> intersection = new ArrayList<>();

		int i = 0;
		int j = 0;

		while(i < arr1.length && j < arr2.length) {
		     
		       	if(arr1[i] < arr2[j]) {
			
				i++;

			}else if (arr1[i] > arr2[j]) {
			
				j++;
			}else {
			
				intersection.add(arr1[i]);

				i++;
				j++;
			}
		}

		System.out.println(intersection);
}
}
