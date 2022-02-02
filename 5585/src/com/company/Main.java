import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = Integer.parseInt(br.readLine());
        int[] coinArr = {500, 100, 50, 10, 5, 1};
        cost = 1000-cost;
        int count =0;
        for(int i=0; i<6; i++){
            int num = cost/coinArr[i];              //잔돈을 단위로 나누면 그 단위 지폐의 수를 알 수 있음.
            if(num>0){                              //지폐수가 0보다 작다는건 그 단위 지폐는 없다는 것
                                                    //450원을 주는데 500원은 필요없다는 말임.
                count += num;                       //지폐 수 있는 만큼 증가
                cost = cost%coinArr[i];             //cost는 다시 잔돈이 됨.
            }
        }
        System.out.println(count);                  //최종 동전 수 출력
    }
}