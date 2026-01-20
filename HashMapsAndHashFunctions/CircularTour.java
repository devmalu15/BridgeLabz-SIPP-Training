
public class CircularTour {
	 public static int findStart(int[] petrol, int[] distance) {
	        int n = petrol.length;
	        int total_tank = 0;
	        int curr_tank = 0;
	        int start = 0;

	        for (int i = 0; i < n; i++) {
	            total_tank += petrol[i] - distance[i];
	            curr_tank += petrol[i] - distance[i];

	            if (curr_tank < 0) {
	                // Cannot start from previous start
	                start = i + 1;
	                curr_tank = 0;
	            }
	        }

	        return (total_tank >= 0) ? start : -1;
	    }

	    public static void main(String[] args) {
	        int[] petrol = {4, 6, 7, 4};
	        int[] distance = {6, 5, 3, 5};
	        int start = findStart(petrol, distance);
	        System.out.println(start); // Expected: 1
	    }

}
