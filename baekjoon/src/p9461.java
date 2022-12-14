import java.io.*;

public class p9461 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // t : 테스트 케이스 개수
        int t = Integer.parseInt(br.readLine());

        // arr : 파도반 수열 P(N)값을 가지는 배열
        long[] arr = new long[100];

        // P(1)부터 P(3)의 값은 1
        for(int i = 0;i<3;i++){
            arr[i] = 1;
        }

        // N>=4일 때는 P(i) = P(i-3) + P(i-2)
        for(int i = 3;i<100;i++){
            arr[i] = arr[i-3] + arr[i-2];
        }

        // t만큼 n을 입력받아 P(n) 출력
        for(int i = 0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[n-1]);
        }
    }
}
