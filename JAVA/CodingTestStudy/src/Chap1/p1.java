package Chap1;

/* 
 * �Ž��� �� ����
 * �Ž����� ���� : 500��, 100��, 50��, 10��
 * �Ž������� ������ ����
 * �մԿ��� �Ž��� �־�� �� ���� N���� �� �Ž��� �־�� �� ������ �ּ� ���� ���ϱ�
 * �Ž��� ��� �� �� N�� �׻� 10�� ���
 */

public class p1 {

	public static void main(String[] args) {
		int n = 1260;
		int cnt = 0;
		int[] coinTypes = {500, 100, 50, 10};
		
		for(int i = 0;i<4;i++) {
			cnt += n /coinTypes[i];
			n %= coinTypes[i];
		}
		System.out.println(cnt);
	}

}
