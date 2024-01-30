import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bf.readLine());
        String[][] doubleArrayList = new String[num][];
        for (int i = 0; i < doubleArrayList.length; i++) {
            doubleArrayList[i] = bf.readLine().split(" ");
        }
        for (int i = 0; i < doubleArrayList.length; i++) {
            for (int j = 0; j < doubleArrayList[i].length; j++) {
                for (int n = 0; n < j; n++) {
                    if (Integer.parseInt(doubleArrayList[i][j]) > Integer.parseInt(doubleArrayList[i][n])) {
                        String temp = doubleArrayList[i][j];
                        doubleArrayList[i][j] = doubleArrayList[i][n];
                        doubleArrayList[i][n] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(doubleArrayList[i][2]);
        }
    }
}