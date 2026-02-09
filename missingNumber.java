import java.util.*;

public class missingNumber{

	public static void main(String[] args) {
	
		int[] arr = {3,0,1};

		int n = arr.length;

		int expectedSum = n * (n + 1) / 2;

		int actualSum = 0;

		for(int num : arr) {
			
			actualSum += num;
		}

		int missingNum = expectedSum - actualSum;

		System.out.println(missingNum);
	}
}
