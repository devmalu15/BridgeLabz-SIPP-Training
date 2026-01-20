import java.util.Scanner;

public class EmployeeIDSorter{
    public static void insertionSort(int[] empIDs){
        int n = empIDs.length;
        for (int i = 1; i < n; i++) {
            int key = empIDs[i];
            int j = i - 1;

            while (j >= 0 && empIDs[j] > key) {
                empIDs[j + 1] = empIDs[j];
                j--;
            }
            empIDs[j + 1] = key;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();

        int[] empIDs = new int[n];
        System.out.println("Enter " + n + " Employees IDs: ");
        for(int i=0;i<n;i++){
            empIDs[i] = sc.nextInt();
        }
        insertionSort(empIDs);
        System.out.println("Sorted Employee IDs: ");
        for(int id:empIDs){
            System.out.print(id + " ");
        }
    }
}