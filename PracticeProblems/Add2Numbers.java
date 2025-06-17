import java.util.Scanner;

public class Add2Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int sum = input1 + input2;
        System.out.println(sum);
        scanner.close();
    }
}
