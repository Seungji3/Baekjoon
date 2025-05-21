import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(rd.readLine());
        String[] inputData = rd.readLine().split("");
        int result = 0;
        for (int i = 0; i < size; i++) {
            result += Integer.parseInt(inputData[i]);
        }
        System.out.println(result);
    }
}