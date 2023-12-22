import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        int count = Integer.parseInt(br.readLine());
        String[] line = br.readLine().split(" ");
        int[] list = new int[count];
        double[] newLine = new double[count];
        double result = 0;

        for (int i = 0; i < list.length;i++){
            list[i] = Integer.parseInt(line[i]);
        }
        int maxvalue = Arrays.stream(list).max().getAsInt();

        for(int i = 0;i<list.length;i++){
            newLine[i] = (double) list[i] /maxvalue*100;
            result += newLine[i];
        }

        System.out.println(result/ newLine.length);

    }
}