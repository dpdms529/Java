package Chap1;

/*
 * �ð� ����
 * ���� N�� �ԷµǸ� 00�� 00�� 00�ʺ��� N�� 59�� 59�ʱ����� ��� �ð� �߿��� 3�� �ϳ��� ���ԵǴ�
 * ��� ����� �� ���ϱ�
 */

import java.util.*;

public class p6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = 0;
		for(int i = 0;i<=n;i++) {
			for(int j = 0;j<60;j++) {
				for(int k = 0;k<60;k++) {
					if(i%10 == 3 || j/10 == 3 || j%10 == 3 || k/10 == 3 || k%10 == 3) {
						cnt++;
					}
				}
			}
		}
		System.out.println(cnt);

	}

}
