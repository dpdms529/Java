package Chap1;

/*
 * 1�� �� ������ ����
 * ��� �� N�� 1�� �� ������ ���� �� ���� �� �ϳ��� �ݺ������� �����Ͽ� ����
 * �� �ι�° ������ N�� K�� ������ ������ ���� ���� ����
 * 1. N���� 1�� ����
 * 2. N�� K�� ������.
 * N�� K�� �־��� �� N�� 1�� �� ������ 1�� Ȥ�� 2���� ������ �����ؾ� �ϴ� �ּ� Ƚ�� ���ϱ�
 * 1<=N<=100000, 2<=K<=100000
 */

import java.util.*;

public class p2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//N, K�� ������ �������� �����Ͽ� �Է� �ޱ�
		int n = sc.nextInt();
		int k = sc.nextInt();
		int result = 0;
		
		while(true) {
			//N�� K�� ������ �������� ���� �� ������ ����
			int target = (n/k)*k;
			result += (n-target);
			//N�� K���� ���� �� (�� �̻� ���� �� ���� ��) �ݺ��� Ż��
			if(n<k) break;
			//K�� ������
			result += 1;
			n /= k;
		}
		//���������� ���� ���� ���Ͽ� 1�� ����
		result += (n-1);
		System.out.println(result);
	}

}
