import java.util.*;
import java.io.*;

public class p2178 {
    // n : 미로 행의 개수, m : 미로 열의 개수
    public static int n;
    public static int m;

    // graph : 미로의 각 칸이 가지는 값을 가지는 이중 리스트
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    // cnt : 미로의 각 칸에 도달할 때까지 이동한 횟수를 나타내는 이중 배열
    public static int[][] cnt;

    // visited : 미로의 각 칸에 방문한 여부를 나타내는 이중 배열
    public static boolean[][] visited;

    // dy : 동서남북으로 이동할 때 y축으로 이동하는 방향을 나타내는 배열
    // dx : 동서남북으로 이동할 때 x축으로 이동하는 방향을 나타내는 배열
    public static int[] dy = {0,0,1,-1};
    public static int[] dx = {1,-1,0,0};

    // 너비 우선 탐색 함수
    public static void bfs(){
        // 시작 위치 (0, 0)
        int y = 0;
        int x = 0;

        // 큐 생성
        Queue<int[]> queue = new LinkedList<>();

        // 미로 시작 위치를 방문 처리 후 큐에 입력
        cnt[y][x] = 1;
        visited[y][x] = true;
        queue.offer(new int[]{y,x});

        // 큐가 빌 때까지 반복
        while(!queue.isEmpty()){
            // 큐에서 위치 출력
            int[] position = queue.poll();
            y = position[0];
            x = position[1];

            //해당 위치에 인접한 칸 중 이동이 가능하며 아직 방문하지 않은 칸이라면 이동횟수를 구하고 방문처리한 후 큐에 입력
            for(int i = 0;i<4;i++){
                int ny = y + dy[i];
                int nx = x + dx[i];
                if(ny>=0 && nx>=0 && ny<n && nx<m && graph.get(ny).get(nx)==1 && !visited[ny][nx]){
                    cnt[ny][nx] = cnt[y][x]+1;
                    visited[ny][nx] = true;
                    queue.offer(new int[]{ny,nx});
                }
            }
        }

        // 미로의 도착 위치에 도달할 때까지 이동한 횟수 출력
        System.out.println(cnt[n-1][m-1]);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // n, m 값 입력받기
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        // n x m 크기로 cnt, visited 배열 생성
        cnt = new int[n][m];
        visited = new boolean[n][m];

        // 미로의 각 칸에 해당하는 값을 graph에 저장
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
            char[] input = br.readLine().toCharArray();
            for(int j = 0;j<m;j++){
                graph.get(i).add(input[j]-'0');
            }
        }

        // 너비 우선 탐색 함수를 사용하여 미로 도착위치까지 도달하는데 이동한 횟수 구하여 출력
        bfs();
    }
}
