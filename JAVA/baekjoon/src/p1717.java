import java.util.Scanner;

public class p1717 {

    // ����� ����(V)�� ����(Union ����)�� ����(E)
    // ����� ������ �ִ� 100,000����� ����
    public static int n, m;
    public static int[] parent = new int[1000001]; // �θ� ���̺� �ʱ�ȭ�ϱ�

    // Ư�� ���Ұ� ���� ������ ã��
    public static int findParent(int x) {
        // ��Ʈ ��尡 �ƴ϶��, ��Ʈ ��带 ã�� ������ ��������� ȣ��
        if (x == parent[x]) return x;
        return parent[x] = findParent(parent[x]);
    }

    // �� ���Ұ� ���� ������ ��ġ��
    public static void unionParent(int a, int b) {
        a = findParent(a);
        b = findParent(b);
        if (a < b) parent[b] = a;
        else parent[a] = b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        // �θ� ���̺�󿡼�, �θ� �ڱ� �ڽ����� �ʱ�ȭ
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        
        for(int i = 0;i<m;i++) {
        	int cmd = sc.nextInt();
        	if(cmd == 0) {
        		int a = sc.nextInt();
        		int b = sc.nextInt();
        		unionParent(a,b);
        	}else if(cmd == 1) {
        		int a = findParent(sc.nextInt());
        		int b = findParent(sc.nextInt());
        		if(a==b) System.out.println("YES");
        		else System.out.println("NO");
        	}
        }
    }
}
