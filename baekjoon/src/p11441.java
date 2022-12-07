import java.util.*;
import java.io.*;

public class p11441 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int sum[] = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0;i<n;i++) {
			a[i] = Integer.parseInt(st.nextToken());
			sum[i+1] = a[i] + sum[i];
		}
		int m = Integer.parseInt(br.readLine());
		for(int i = 0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			System.out.println(sum[e]-sum[s-1]);
		}
	}

}
