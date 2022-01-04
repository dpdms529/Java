package Chap1;

/*
 * ���谡 ��� ����
 * N���� ���谡�� ������� ������ ����
 * �������� X�� ���谡�� �ݵ�� X�� �̻����� ������ ���谡 �׷쿡 �����ؾ� ������ ���� �� ����
 * N���� ���谡�� ���� ������ �־����� �� ������ ���� �� �ִ� �׷� ���� �ִ밪 ���ϱ�
 */

import java.util.*;

public class p4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s[] = new int[n];
		for(int i = 0;i<n;i++) {
			s[i] = sc.nextInt();
		}
		Arrays.sort(s);
		int group = 0;
		int cnt = 0;
		for(int i = 0;i<n;i++) {
			cnt++;
			if(s[i] <= cnt) {
				group++;
				cnt = 0;
			}
		}
		System.out.println(group);
	}

}
