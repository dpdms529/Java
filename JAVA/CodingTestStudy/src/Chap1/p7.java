package Chap1;

/*
 * �ս��� ����Ʈ ����
 * 8 x 8 ��ǥ
 * ����Ʈ�� L�� ���·θ� �̵� ����, ���� �����δ� ���� �� ����
 * 1. �������� �� ĭ �̵��� �� �������� �� ĭ �̵�
 * 2. �������� �� ĭ �̵��� �� �������� �� ĭ �̵�
 * ����Ʈ�� ��ġ�� �־����� �� ����Ʈ�� �̵��� �� �ִ� ����� �� ����ϱ�
 */

import java.util.*;

public class p7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int x = s.charAt(0) - 'a' + 1;
		int y = s.charAt(1) - '0';
		
		int dx[] = {2,2,1,-1,-2,-2,1,-1};
		int dy[] = {-1,1,-2,-2,-1,1,2,2};
		
		int cnt = 0;
		for(int i = 0;i<8;i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx<1 || nx>8 || ny<1 || ny>8) continue;
			cnt++;
		}
		System.out.println(cnt);

	}

}
