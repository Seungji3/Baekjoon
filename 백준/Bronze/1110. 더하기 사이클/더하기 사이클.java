import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int out = num;
        int[] in_list = new int[2];


        while(true){
            in_list[0] = front(num);
            in_list[1] = back(num);
            num = plus_int(in_list[0],in_list[1]);
            if(num/10==0){
                count++;
                num = in_list[1]*10+num;
            }else{
                count++;
                num = in_list[1]*10+back(num);
            }
            if(out==num){
                System.out.println(count);
                break;
            }
        }


    }
    static int front(int num){
        num/= 10;
        return num;
    }
    static int back(int num){
        num%= 10;
        return num;
    }
    static int plus_int(int front, int back){
        int num = front+back;
        return num;
    }
}