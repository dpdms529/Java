package p1197;

import java.util.*;
import java.io.*;

class Edge implements Comparable<Edge>{
    int from;
    int to;
    int cost;
    public Edge(int from, int to, int cost){
        this.from = from;
        this.to = to;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return cost - o.cost;
    }
}
public class Main {
    static int V, E;
    static PriorityQueue<Edge> pq = new PriorityQueue<>();
    static int[] parent;

    static int find(int x){
        if(x == parent[x]){
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    static void union(int a, int b){
        parent[find(a)] = find(b);
    }

    static void kruskal(){
        long sum = 0;
        int cnt = 0;
        while(!pq.isEmpty()){
            Edge edge = pq.poll();
            if(find(edge.from) != find(edge.to)){
                union(edge.from, edge.to);
                sum += edge.cost;
                cnt++;
            }
            if(cnt==V-1) break;
        }
        System.out.println(sum);
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        parent = new int[V+1];
        for(int i = 1;i<=V;i++){
            parent[i] = i;
        }

        for(int i = 0;i<E;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            pq.offer(new Edge(a,b,c));
        }

        kruskal();
    }
}
