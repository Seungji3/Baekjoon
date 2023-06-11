import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int n = num; n > 0; n--) {
            for (int i = 0; i < n-1; i++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= num - n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}