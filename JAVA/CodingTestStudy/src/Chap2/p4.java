package Chap2;

import java.util.*;

public class p4 {
	
	public static boolean[] visited = new boolean[9];
	public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	
	public static void bfs(int start) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(start);
		//���� ��带 �湮 ó��
		visited[start] = true;
		//ť�� �� ������ �ݺ�
		while(!q.isEmpty()) {
			//ť���� �ϳ��� ���Ҹ� �̾� ���
			int x = q.poll();
			System.out.print(x + " ");
			//�ش� ���ҿ� �����, ���� �湮���� ���� ���ҵ��� ť�� ����
			for(int i = 0;i<graph.get(x).size();i++) {
				int y = graph.get(x).get(i);
				if(!visited[y]) {
					q.offer(y);
					visited[y] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		//�׷��� �ʱ�ȭ
				for(int i = 0;i<9;i++) {
					graph.add(new ArrayList<Integer>());
				}
				
				//��� 1�� ����� ��� ���� ����
				graph.get(1).addAll(List.of(2,3,8));
				
				//��� 2�� ����� ��� ���� ����
				graph.get(2).addAll(List.of(1,7));
				
				//��� 3�� ����� ��� ���� ����
				graph.get(3).addAll(List.of(1,4,5));
				
				//��� 4�� ����� ��� ���� ����
				graph.get(4).addAll(List.of(3,5));

				//��� 5�� ����� ��� ���� ����
				graph.get(5).addAll(List.of(3,4));
				
				//��� 6�� ����� ��� ���� ����
				graph.get(6).addAll(List.of(7));
				
				//��� 7�� ����� ��� ���� ����
				graph.get(7).addAll(List.of(2,6,8));
				
				//��� 8�� ����� ��� ���� ����
				graph.get(8).addAll(List.of(1,7));
				
				bfs(1);
	}

}
