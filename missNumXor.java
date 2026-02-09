import java.util.*;

public class missNumXor{
	
	public static void main(String[] args) {

	int[] arr = {3,0,1};
	
	int n = arr.length;

	int xor = 0;
	
	for(int i=0; i<=n; i++) {
	
		xor = xor ^ i;
	}

	for(int num : arr) {
	
		xor = xor ^ num;
	}

	System.out.println(xor);
}
}
