import java.util.*;

public class majorityElement{

	public static void main(String[] args) {
	
		int arr[] = {2,2,3,2,1,2,4,2};

		int candidate = 0;

		int count = 0;

		for(int num : arr) {
		
			if(count == 0) {
			
				candidate = num;
				count = 1;

			}else if(num == candidate) {
			
				count++;
			}else {
				count--;
			}
		}

		System.out.println(candidate);
	}
}
