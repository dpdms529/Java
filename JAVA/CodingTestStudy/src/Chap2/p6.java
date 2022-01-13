package Chap2;

/*
 * �̷� Ż�� ����
 * N x M ũ���� �̷�
 * (1,1)���� ����, �̷��� �ⱸ�� (N,M)
 * �� ���� �� ĭ�� �̵� ����
 * ������ �ִ� �κ��� 0, ���� �κ��� 1
 * �̷θ� Ż���ϱ� ���� �������� �ϴ� �ּ� ĭ�� ���� ���ϱ�
 * ĭ�� ������ ���� ĭ�� ������ ĭ�� �����Ͽ� ���
 */

import java.util.*;

public class p6 {
	
	public static int graph[][];
	public static int n, m;
	public static int dx[] = {0,0,-1,1};
	public static int dy[] = {-1,1,0,0};
	
	public static void bfs(int y, int x) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] {y,x});
		while(!queue.isEmpty()) {
			int pos[] = queue.poll();
			y = pos[0];
			x = pos[1];
			for(int i = 0;i<4;i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx>=0 && nx<m && ny>=0 && ny<n) {
					if(graph[ny][nx] == 1 && (nx!=0 || ny!=0)) {
						queue.offer(new int[] {ny,nx});
						graph[ny][nx] = graph[y][x] + 1;
					}
				}
			}
		}	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new int[n][m];
		sc.nextLine();
		for(int i = 0;i<n;i++) {
			String s = sc.nextLine();
			for(int j = 0;j<m;j++) {
				graph[i][j] = s.charAt(j) - '0';
			}
		}
		bfs(0,0);
		System.out.println(graph[n-1][m-1]);
	}

}
