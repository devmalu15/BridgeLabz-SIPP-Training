import java.util.*;
public class ZeroSumSubarrays {
	 public static void findZeroSumSubarrays(int[] arr) {
	        Map<Integer, List<Integer>> map = new HashMap<>();
	        int cumSum = 0;

	        // to handle zero-sum subarrays starting from index 0
	        map.put(0, new ArrayList<>());
	        map.get(0).add(-1);

	        for (int i = 0; i < arr.length; i++) {
	            cumSum += arr[i];

	            if (map.containsKey(cumSum)) {
	                for (Integer startIdx : map.get(cumSum)) {
	                    System.out.println("Subarray found from " + (startIdx + 1) + " to " + i);
	                }
	            }

	            map.putIfAbsent(cumSum, new ArrayList<>());
	            map.get(cumSum).add(i);
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};
	        findZeroSumSubarrays(arr);
	    }

}
