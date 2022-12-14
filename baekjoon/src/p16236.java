import java.util.*;
import java.io.*;

class Fish implements Comparable<Fish>{
    int y;
    int x;
    int dist;
    Fish(int y, int x, int dist){
        this.y = y;
        this.x = x;
        this.dist = dist;
    }

    @Override
    public int compareTo(Fish o) {
        if(this.dist == o.dist){
            if(this.y == o.y){
                return this.x - o.x;
            }else return this.y - o.y;
        }else return this.dist - o.dist;
    }
}

class Shark extends Fish{
    int time;
    Shark(int y, int x, int time) {
        super(y,x,0);
        this.time = time;
    }
}

public class p16236 {
    public static int n;
    public static int[][] graph;
    public static boolean[][] visited;
    public static ArrayList<Fish> fishList;
    public static int size = 2;
    public static int ate = 0;

    public static int[] dy = {-1,0,0,1};
    public static int[] dx = {0,-1,1,0};

    public static void bfs(Shark s){
        Queue<Shark> queue = new LinkedList<>();
        visited[s.y][s.x] = true;
        queue.offer(s);
        while(!queue.isEmpty()){
            s = queue.poll();
            for(int i = 0;i<4;i++){
                int ny = s.y + dy[i];
                int nx = s.x + dx[i];
                if(ny>=0 && nx>=0 && ny<n && nx<n){
                    if(!visited[ny][nx] && graph[ny][nx]<=size){
                        visited[ny][nx] = true;
                        queue.offer(new Shark(ny,nx,s.time+1));
                        if(graph[ny][nx]!=0 && graph[ny][nx]<size){
                            fishList.add(new Fish(ny,nx,s.time+1));
                        }
                    }
                }
            }
        }
    }

    public static void eat(Shark s){
        while(true){
            fishList = new ArrayList<>();
            visited = new boolean[n][n];
            bfs(s);
            if(fishList.size()==0){
                System.out.println(s.time);
                break;
            }else{
                Collections.sort(fishList);
                Fish f = fishList.get(0);
                s.y = f.y;
                s.x = f.x;
                s.time = f.dist;
                graph[f.y][f.x] = 0;
                ate++;
                if(ate==size){
                    size++;
                    ate = 0;
                }
            }
        }
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        graph = new int[n][n];
        Shark shark = new Shark(0,0,0);
        StringTokenizer st;
        for(int i = 0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0;j<n;j++){
                graph[i][j] = Integer.parseInt(st.nextToken());
                if(graph[i][j] == 9){
                    shark.y = i;
                    shark.x = j;
                    graph[i][j] = 0;
                }
            }
        }
        eat(shark);
    }
}
