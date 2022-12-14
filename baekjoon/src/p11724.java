import java.util.*;
import java.io.*;

public class p11724 {
    // n : 정점의 개수
    public static int n;

    // m : 간선의 개수
    public static int m;

    // graph : 각 정점에 연결된 정점들을 나타내는 이중 리스트
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    // visited : 정점 방문 여부를 나타내는 배열
    public static boolean[] visited;

    public static void bfs(int start){
        // 큐 생성
        Queue<Integer> queue = new LinkedList<>();

        // 시작 정점 방문 처리 후 큐에 삽입
        visited[start] = true;
        queue.offer(start);

        // 큐가 빌 때까지 반복
        while(!queue.isEmpty()){
            // 큐에서 정점 추출
            int x = queue.poll();

            // 해당 정점에 연결된 정점 중 방문한적 없는 정점들은 방문 처리 후 큐에 삽입
            for(int i = 0;i<graph.get(x).size();i++){
                int y = graph.get(x).get(i);
                if(!visited[y]){
                    visited[y] = true;
                    queue.offer(y);
                }
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n, m값 입력
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // visited 배열 생성
        visited = new boolean[n];

        // graph 초기화
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        // graph 값 입력
        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken()) - 1;
            int v = Integer.parseInt(st.nextToken()) - 1;
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        // cnt : 연결 요소 개수
        int cnt = 0;

        // 방문하지 않은 정점일 경우 bfs()를 실행하여 연결된 정점을 모두 방문 처리 후 cnt 값 1 증가
        for(int i = 0;i<n;i++){
            if(!visited[i]){
                bfs(i);
                cnt++;
            }
        }

        // cnt 출력
        System.out.println(cnt);
    }
}