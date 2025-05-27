import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(rd.readLine());
        int result = 666;
        int count = 0;
        while (count < num){
            if (Integer.toString(result).contains("666"))
                count++;
            if (count == num)
                break;
            result++;
        }
        System.out.println(result);
    }
}