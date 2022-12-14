import java.util.*;
import java.io.*;

public class p2667 {
    // n : 지도의 크기
    public static int n;

    //  graph : 지도의 각 칸의 값을 가지는 이중 리스트
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    // visited : 지도의 각 칸의 방문 여부를 나타내는 이중 배열
    public static boolean visited[][];

    // dy : 동서남북으로 이동할 때 y축으로 이동하는 방향을 나타내는 배열
    // dx : 동서남북으로 이동할 때 x축으로 이동하는 방향을 나타내는 배열
    public static int[] dy = {0,0,1,-1};
    public static int[] dx = {1,-1,0,0};

    // 너비 우선 탐색 함수 (입력 : 시작 위치)
    public static int bfs(int y, int x){
        // 큐 생성
        Queue<int[]> queue = new LinkedList<>();

        // cnt : 단지에 속하는 집의 수
        int cnt = 0;

        // 시작 위치 방문 처리 후 큐에 입력
        visited[y][x] = true;
        queue.offer(new int[]{y,x});

        // 큐가 빌 때까지 반복
        while(!queue.isEmpty()){
            // 큐에서 위치 출력 및 cnt 값 1 증가
            int[] position = queue.poll();
            y = position[0];
            x = position[1];
            cnt++;

            // 해당 위치에 인접한 칸 중 집이 존재하며 방문하지 않은 칸이면 방문 처리하고 큐에 입력
            for(int i = 0;i<4;i++){
                int ny = y + dy[i];
                int nx = x + dx[i];
                if(ny>=0 && nx>=0 && ny<n && nx<n && graph.get(ny).get(nx)==1 && !visited[ny][nx]){
                    visited[ny][nx] = true;
                    queue.offer(new int[]{ny,nx});
                }
            }
        }

        // cnt 값 리턴
        return cnt;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n 값 입력 받기
        n = Integer.parseInt(br.readLine());

        // n x n크기의 visited 배열 생성
        visited  = new boolean[n][n];
        
        // 지도의 각 칸에 해당하는 값을 graph에 저장
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
            char[] input = br.readLine().toCharArray();
            for(int j = 0;j<n;j++){
                graph.get(i).add(input[j]-'0');
            }
        }
        
        // cnt : 각 단지에 속하는 집의 수를 가지는 리스트
        ArrayList<Integer> cnt = new ArrayList<>();
        
        // 지도의 각 칸을 돌며 집이 있고 방문하지 않은 칸이라면 bfs()를 실행시켜 해당 단지에 속하는 집의 수 구하기
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(graph.get(i).get(j)==1 && !visited[i][j]){
                    cnt.add(bfs(i,j));
                }
            }
        }
        
        // 각 단지의 집의 수를 오름차순으로 정렬
        Collections.sort(cnt);
        
        // 단지 수 출력
        System.out.println(cnt.size());
        
        // 집의 수가 적은 단지부터 많은 단지 순으로 단지에 속하는 집의 수 출력
        for(int i:cnt){
            System.out.println(i);
        }
    }
}
