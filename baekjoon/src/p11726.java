import java.io.*;

public class p11726 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // n : 직사각형의 가로 길이
        int n = Integer.parseInt(br.readLine());
        
        // arr : 2 x i 크기의 직사각형을 1 x 2 또는 2 x 1 타일로 채우는 방법의 수를 가지는 배열 
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;
        for(int i = 2;i<=n;i++){
            // 2 x i 크기의 직사각형을 1 x 2 또는 2 x 1 타일로 채우는 방법의 수는 arr[i-1] + arr[i-2]
            // 2 x n 크기의 직사각형을 채우는 방법의 수를 10007로 나눈 나머지를 출력해야하므로 arr[i]는 아래와 같이 구함 
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;
        }
        
        // arr[n] 출력
        System.out.println(arr[n]);

    }
}
