package Chap5;

/*
 * 1�� ����� ����
 * ���� X�� �־����� �� ����� �� �ִ� ����
 * 1. X�� 5�� ������ �������� 5�� ����
 * 2. X�� 3���� ������ �������� 3���� ����
 * 3. X�� 2�� ������ �������� 2�� ����
 * 4. X���� 1�� ��
 * ���� 4���� ����Ͽ� 1�� ������� ��
 * ������ ����ϴ� Ƚ���� �ּڰ� ���ϱ�
 */

import java.util.*;

public class p4 {

	public static int[] d = new int[30001];
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 2;i<=x;i++) {
			d[i] = d[i-1] + 1;
			if(i%2 == 0) {
				d[i] = Math.min(d[i], d[i/2] + 1);
			}
			if(i%3 == 0) {
				d[i] = Math.min(d[i], d[i/3] + 1);
			}
			if(i%5 == 0) {
				d[i] = Math.min(d[i],  d[i/5] + 1);
			}
		}
		System.out.println(d[x]);
	}

}
