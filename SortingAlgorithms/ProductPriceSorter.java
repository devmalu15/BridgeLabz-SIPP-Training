import java.util.Scanner;

public class ProductPriceSorter {
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high);
            quickSort(prices, low, pi - 1);
            quickSort(prices, pi + 1, high);
        }
    }

    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (prices[j] <= pivot) {
                i++;
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        int[] prices = new int[n];
        System.out.println("Enter prices of " + n + " products: ");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        quickSort(prices, 0, n - 1);
        System.out.println("Sorted product prices:");
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}