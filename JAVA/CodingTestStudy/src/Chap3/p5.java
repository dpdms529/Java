package Chap3;

/*
 * �� �迭�� ���� ��ü ����
 * N���� �ڿ����� ������ �迭 A, B
 * �ִ� K�� �ٲ�ġ�� ���� ���� ����
 * �迭 A�� ��� ���� ���� �ִ밪 ���ϱ�
 */

import java.util.*;

public class p5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		Integer b[] = new Integer[n];
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<n;i++) {
			b[i] = sc.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		int sum = 0;
		for(int i = 0;i<n;i++) {
			if(i<k) sum += b[i];
			else sum += a[i];
		}
		System.out.println(sum);
	}

}
