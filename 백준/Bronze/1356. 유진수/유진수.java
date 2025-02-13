import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputData = bf.readLine();
        Boolean isU = false;

        for (int i = 1; i < inputData.length(); i++) {
            String text1 = inputData.substring(0, i);
            String text2 = inputData.substring(i, inputData.length());
            if (duplicate(text1) == duplicate(text2)){
                isU = true;
                break;
            }
        }
        System.out.println(isU ? "YES" : "NO");
    }

    public static int duplicate(String data) {
        int[] dataBox = Arrays.stream(data.split("")).mapToInt(Integer::parseInt).toArray();
        int result = 1;
        for (int item : dataBox) {
            result *= item;
        }
        return result;
    }
}