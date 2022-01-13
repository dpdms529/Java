package Chap2;

/*
 * ����� ��� �Ա� ����
 * N x M ũ���� ���� Ʋ
 * ������ �շ� �ִ� �κ��� 0, ĭ���̰� �����ϴ� �κ��� 1�� ǥ��
 * ������ �շ� �ִ� �κг����� ��,��,��,��� �پ� �ִ� ��� ���� ����Ǿ� �ִ� ������ ����
 * ���� Ʋ�� ����� �־����� �� �����Ǵ� �� ���̽�ũ���� ���� ���ϱ�
 */

import java.util.*;

public class p5 {
	public static int n, m;
	public static int[][] graph;
	
	public static boolean dfs(int x, int y) {
		if(x<0 || x>=m || y<0 || y>=n) {
			return false;
		}
		if(graph[y][x] == 0) {
			graph[y][x] = 1;
			dfs(x-1,y);
			dfs(x,y-1);
			dfs(x+1,y);
			dfs(x,y+1);
			return true;
		}
		return false;
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
		
		int cnt = 0;
		for(int i = 0;i<n;i++) {
			for(int j = 0;j<m;j++) {
				if(dfs(j,i)) cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}

//public class p5 {
//	
//	public static boolean[][] visited; 
//	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
//	public static int dx[] = {0,0,-1,1};
//	public static int dy[] = {-1,1,0,0}; 
//	public static void dfs(int y, int x) {
//		visited[y][x] = true;
//		for(int i = 0;i<4;i++) {
//			int nx = x + dx[i];
//			int ny = y + dy[i];
//			if(nx>=0 && nx<graph.get(y).size() && ny>=0 && ny<graph.size()){
//				if(!visited[ny][nx]) dfs(ny,nx);
//			}
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		visited = new boolean[n][m];
//		sc.nextLine();
//		for(int i = 0;i<n;i++) {
//			String s = sc.nextLine();
//			graph.add(new ArrayList<>());
//			for(int j = 0;j<m;j++) {
//				int num =  s.charAt(j) - '0';
//				graph.get(i).add(num);
//				if(num == 1) visited[i][j] = true;
//			}
//		}
//		int cnt = 0;
//		for(int i = 0;i<n;i++) {
//			for(int j = 0;j<m;j++) {
//				if(graph.get(i).get(j) == 0 && !visited[i][j]) {
//					dfs(i,j);
//					cnt++;
//				}
//			}
//		}
//		System.out.println(cnt);
//		
//	}
//
//}
