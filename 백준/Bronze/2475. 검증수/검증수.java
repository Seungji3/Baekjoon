import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int count= 0,num=0;
        for(int i =0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0;i<a.length;i++){
            count = a[i]*a[i];
            num+=count;
        }
        System.out.println(num%10);
    }
}