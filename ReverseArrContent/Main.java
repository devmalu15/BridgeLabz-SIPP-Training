
public class Main {
	public static void main(String[] args) {
		int[] arr = {1, 2, 345, 567, 789};
		
//		for(int i = 0; i < arr.length; i++) {
//			int Orgnum = arr[i];
//			int num = Orgnum;
//			int count = 0;
//			int result = 0;
//			int multiplier = 1;
//			while(num != 0) {
//				num = num / 10;
//				multiplier = multiplier * 10;
//				count++;
//			}
//			multiplier = multiplier / 10;
//			while(count != 0) {
//				result = ((Orgnum % 10) * multiplier) + result;
//				count--;
//				multiplier = multiplier / 10;
//				Orgnum  = Orgnum / 10;
//			}
//			arr[i] = result;
//		}
//		
		
		for(int i = 0; i < arr.length; i++) {
			int result = 0;
			while(arr[i] != 0) {
				result = ((arr[i] % 10)) + (result * 10);
				arr[i] = arr[i] / 10;
			}
			arr[i] = result;
		}
		
		
		
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
	}

}
