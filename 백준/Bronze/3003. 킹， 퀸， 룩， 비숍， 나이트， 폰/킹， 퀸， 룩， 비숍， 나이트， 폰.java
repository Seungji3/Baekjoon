import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int[] validData = new int[]{1, 1, 2, 2, 2, 8};
        int[] inputData = Stream.of(rd.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int result[] = new int[6];

        for (int i = 0; i < validData.length; i++) {
            result[i] = validData[i] - inputData[i];
        }
        for (int data: result){
            System.out.print(data+" ");
        }
    }
}