import java.util.*;

public class longestConsecutiveSequence{

	public static void main(String[] args) {
	
		int[] arr = {100,3,200,1,4,2,5};

		HashSet<Integer> set = new HashSet<>();

		for (int num : arr) {
		
			set.add(num);
		}
		
		System.out.println(set);

		int longest = 0;

		for (int num : set) {
		
			if(!set.contains(num-1)){
			
				int current = num;
				int length = 1;
			

				while(set.contains(current+1))  {
			
					current++;
					length++;
				}
			

				longest = Math.max(longest,length);
			
			}
		}

			 System.out.println(longest);
	                 System.out.println(set);

	}
}
